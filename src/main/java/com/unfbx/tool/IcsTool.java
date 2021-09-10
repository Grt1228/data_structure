package com.unfbx.tool;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.*;
import net.fortuna.ical4j.model.component.VAlarm;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VTimeZone;
import net.fortuna.ical4j.model.parameter.Cn;
import net.fortuna.ical4j.model.parameter.Role;
import net.fortuna.ical4j.model.property.*;
import net.fortuna.ical4j.util.UidGenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-10
 */
public class IcsTool {
    //Recur  定义重复的事件
    //RRule     规则
    //主标签

    public static void main(String[] args) throws ParserException, IOException {

        //importFile();
        //exportFile();
        test();
    }

    /**
     * 导入文件
     *
     * @throws ParserException
     * @throws IOException
     */
    public static void importFile() throws IOException, ParserException {

        //FileInputStream fis = new FileInputStream("D:\\迅雷云盘\\2.ics");
        FileInputStream fis = new FileInputStream("D:\\2.ics");
        CalendarBuilder build = new CalendarBuilder();
        Calendar calendar = build.build(fis);

        for (Iterator i = calendar.getComponents(Component.VEVENT).iterator(); i.hasNext();) {
            VEvent event = (VEvent) i.next();
            // 开始时间
            System.out.println("开始时间：" + event.getStartDate().getValue());
            // 结束时间
            System.out.println("结束时间：" + event.getEndDate().getValue());
            if (null != event.getProperty("DTSTART")) {
                ParameterList parameters = event.getProperty("DTSTART").getParameters();
                if (null != parameters.getParameter("VALUE")) {
                    System.out.println(parameters.getParameter("VALUE").getValue());
                }
            }
            // 主题
            System.out.println("主题：" + event.getSummary().getValue());
            // 地点
            if (null != event.getLocation()) {
                System.out.println("地点：" + event.getLocation().getValue());
            }
            // 描述
            if (null != event.getDescription()) {
                System.out.println("描述：" + event.getDescription().getValue());
            }
            // 创建时间
            if (null != event.getCreated()) {
                System.out.println("创建时间：" + event.getCreated().getValue());
            }
            // 最后修改时间
            if (null != event.getLastModified()) {
                System.out.println("最后修改时间：" + event.getLastModified().getValue());
            }
            // 重复规则
            if (null != event.getProperty("RRULE")) {
                System.out.println("RRULE:" + event.getProperty("RRULE").getValue());
            }
            // 提前多久提醒
            for (Iterator alrams = event.getAlarms().iterator(); alrams.hasNext();) {
                VAlarm alarm = (VAlarm) alrams.next();
                Pattern p = Pattern.compile("[^0-9]");
                String aheadTime = alarm.getTrigger().getValue();
                Matcher m = p.matcher(aheadTime);
                int timeTemp = Integer.valueOf(m.replaceAll("").trim());
                if (aheadTime.endsWith("W")) {
                    System.out.println("提前多久：" + timeTemp + "周");
                } else if (aheadTime.endsWith("D")) {
                    System.out.println("提前多久：" + timeTemp + "天");
                } else if (aheadTime.endsWith("H")) {
                    System.out.println("提前多久：" + timeTemp + "小时");
                } else if (aheadTime.endsWith("M")) {
                    System.out.println("提前多久：" + timeTemp + "分钟");
                } else if (aheadTime.endsWith("S")) {
                    System.out.println("提前多久：" + timeTemp + "秒");
                }
            }
            // 邀请人
            if (null != event.getProperty("ATTENDEE")) {
                ParameterList parameters = event.getProperty("ATTENDEE").getParameters();
                System.out.println(event.getProperty("ATTENDEE").getValue().split(":")[1]);
                System.out.println(parameters.getParameter("PARTSTAT").getValue());
            }
            System.out.println("----------------------------");
        }
    }

    public static void test(){
        // 创建一个时区（TimeZone）
        TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry();
        TimeZone timezone = registry.getTimeZone("Asia/Shanghai");
        VTimeZone tz = timezone.getVTimeZone();

        // 创建日历
        Calendar calendar = new Calendar();
        calendar.getProperties().add(new ProdId("-//Ben Fortuna//iCal4j 3.0//EN"));
        calendar.getProperties().add(Version.VERSION_2_0);
        calendar.getProperties().add(CalScale.GREGORIAN);

        java.util.Calendar calendarDate = java.util.Calendar.getInstance();
        calendarDate.set(java.util.Calendar.MONTH, java.util.Calendar.DECEMBER);
        calendarDate.set(java.util.Calendar.DAY_OF_MONTH, 25);

        // initialise as an all-day event..
        VEvent christmas = new VEvent(new Date(calendarDate.getTime()), "Christmas Day");

        // Generate a UID for the event..
        UidGenerator ug = new UidGenerator() {
            @Override
            public Uid generateUid() {
                return new Uid();
            }
        };
        christmas.getProperties().add(new Uid(UUID.randomUUID().toString()));
        calendar.getComponents().add(christmas);

        //创建事件：开始时间，结束时间，时间描述信息
        VEvent event = new VEvent(new DateTime(1631260924231L), new DateTime(1631268124000L), "晚上锻炼身体");

        //添加事件
        calendar.getComponents().add(event);

        System.out.println(calendar);
    }

    /**
     * 导出文件
     */
    public static void exportFile() {
        try {
            // 创建一个时区（TimeZone）
            TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry();
            TimeZone timezone = registry.getTimeZone("Asia/Shanghai");
            VTimeZone tz = timezone.getVTimeZone();

            // 创建日历
            Calendar calendar = new Calendar();

            calendar.getProperties().add(new ProdId("-//Ben Fortuna//iCal4j 3.0//EN"));
            calendar.getProperties().add(Version.VERSION_2_0);
            calendar.getProperties().add(CalScale.GREGORIAN);



            // 时间主题
            String summary = "重复事件测试";
            // 开始时间
            DateTime start = new DateTime(1478016000000L);
            // 开始时间转换为UTC时间（UTC ＋ 时区差 ＝ 本地时间 ）
            start.setUtc(true);
            // 结束时间
            DateTime end = new DateTime(1478016000000L);
            // 结束时间设置成UTC时间（UTC ＋ 时区差 ＝ 本地时间 ）
            end.setUtc(true);
            // 新建普通事件
            // VEvent event = new VEvent(start, end, summary);
            // 定义全天事件（注意默认是UTC时间）
            VEvent event = new VEvent(new Date(1478016000000L), new Date(1478016000000L), summary);
            event.getProperties().add(new Location("南京堵路"));
            // 生成唯一标示
            //event.getProperties().add(new Uid(new UidGenerator("iCal4j").generateUid().getValue()));
            // 添加时区信息
            event.getProperties().add(tz.getTimeZoneId());
            // 添加邀请者
//            Attendee dev1 = new
//                    Attendee(URI.create("mailto:dev1@mycompany.com"));
//            dev1.getParameters().add(Role.REQ_PARTICIPANT);
//            dev1.getParameters().add(new Cn("Developer 1"));
//            event.getProperties().add(dev1);
            // 重复事件
            Recur recur = new Recur(Recur.WEEKLY, Integer.MAX_VALUE);
            recur.getDayList().add(WeekDay.MO);
            recur.getDayList().add(WeekDay.TU);
            recur.getDayList().add(WeekDay.WE);
            recur.getDayList().add(WeekDay.TH);
            recur.getDayList().add(WeekDay.FR);
            RRule rule = new RRule(recur);
            event.getProperties().add(rule);
            // 提醒,提前10分钟
//            VAlarm valarm = new VAlarm(new Dur(0, 0, -10, 0));
//            valarm.getProperties().add(new Summary("Event Alarm"));
//            valarm.getProperties().add(Action.DISPLAY);
//            valarm.getProperties().add(new Description("Progress Meeting at 9:30am"));
//            // 将VAlarm加入VEvent
//            event.getAlarms().add(valarm);
            // 添加事件
            calendar.getComponents().add(event);
            // 验证
            calendar.validate();
            FileOutputStream fout = new FileOutputStream("D://2.ics");
            CalendarOutputter outputter = new CalendarOutputter();
            outputter.output(calendar, fout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
