package com.unfbx.top10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description
 * @Author Grt
 * @Date 2020-12-22
 */
public class GreedyAlgorithm {

    public static void main(String[] args) {
        //创建广播电台放入到map中
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();


        //将各个电台放到map中
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");

        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");
        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("上海");
        hashSet4.add("天津");

        HashSet<String> hashSet5 = new HashSet<>();
        hashSet5.add("杭州");
        hashSet5.add("大连");

        //加入map
        broadcasts.put("k1", hashSet1);
        broadcasts.put("k2", hashSet2);
        broadcasts.put("k3", hashSet3);
        broadcasts.put("k4", hashSet4);
        broadcasts.put("k5", hashSet5);


        //存放所有的地区
        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");

        //创建集合，存放选择的电台集合
        ArrayList<String> selects = new ArrayList<>();

        //定义一个临时的集合，在遍历的过程中，存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
        HashSet<String> tempSet = new HashSet<>();

        //定义maxkey，保存一次遍历过程中，能够覆盖最大未覆盖地区对应的电台的key
        //如果maxkey不为null，则加入selects
        String maxKey = null;
        while (allAreas.size() != 0) {//不为0表示还没有覆盖到所有的地区
            //初始化maxkey
            maxKey = null;

            //遍历broadcasts取出对应的key
            for (String key : broadcasts.keySet()) {
                //初始化
                tempSet.clear();

                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);

                //取出tempSet和allareas集合的交集，交集会赋给tempSet
                tempSet.retainAll(allAreas);
                //如果当前这个集合包含的未覆盖地区数量，比maxKey指向的地区还多,就需要重置maxKey

                if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }

            //内层循环结束
            //maxKey！= null ，就要将maxKey加入到selects
            if (maxKey != null) {
                selects.add(maxKey);
                //酱maxkey指向的广播电台覆盖地区从allareas中去掉
                allAreas.removeAll(broadcasts.get(maxKey));
            }

        }

        System.out.println("结果：" + selects);

    }
}
