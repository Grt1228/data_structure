package com.unfbx.设计模式.three_proxy.static_mode;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-05
 */
public class Client {

    /**
     * 不修改目标对象的情况下，能通过代理对象对目标功能进行扩展
     *
     * 缺点：代理对象需要实现和被代理对象一样的接口，容易产生类爆炸
     *      当接口增加方法时候，目标对象和代理对象都需要维护
     * @param args
     */

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象传递给代理对象

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象调用到被代理对象的目标方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
