package com.unfbx.设计模式.three_proxy.cglib;

/**
 * @Description
 *
 * 静态代理和jdk动态代理都需要目标对象实现一个接口，但是有时候目标对象只是一个单独的对象，
 * 并没有实现任何的接口，这个时候可以使用目标对象子类来实现代理，这就是cglib代理
 *
 *
 * cglib代理也叫子类代理，它是在内存中构建一个子类对象从而实现对目标对象功能扩展
 *
 *
 * cglib是一个强大的高性能的代码生成包。它可以在运行期扩展java类与实现java接口，它泛指的被许多aop的框架使用
 * 例如：spring aop 实现方法拦截
 *
 * aop编程中如何选择代理模式：
 * 1、目标对象需要实现接口，用jdk代理
 * 2、目标对象不需要实现接口，用cglib代理
 * @Author Grt
 * @Date 2021-02-07
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();

        //执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
