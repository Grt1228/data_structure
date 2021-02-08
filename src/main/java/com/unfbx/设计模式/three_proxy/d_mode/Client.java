package com.unfbx.设计模式.three_proxy.d_mode;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-05
 */
public class Client {


    public static void main(String[] args) {
        //创建目标对象

        ITeacherDao teacherDao = new TeacherDao();


        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        System.out.println("proxyInstance:"+proxyInstance.getClass());
        proxyInstance.teach();
    }
}
