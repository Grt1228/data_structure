package com.unfbx.设计模式.one_single;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Description
 *
 * 懒汉式（线程安全,静态内部类）
 * 延迟加在效率较高
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest07 {

    public static void main(String[] args) {
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
        System.out.println(Singleton07.getInstance());
    }

}
//singleton07类被装载时候不会立即实例化，在需要实例化时候调用getInstance方法才会装载SingletonInstance类,从而完成Singleton的实例化
//类的静态属性只有在被装载时候初始化,只初始化一次,jvm保证线程安全性,类初始化时候其他线程无法进入
//避免线程不安全,利用静态内部类特点延迟加载,效率搞

class Singleton07{


    private Singleton07(){

    }

    private static Singleton07 singleton;
    //静态内部类包含一个静态属性
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    //静态共有方法，直接返回内部类的静态变量属性
    public static Singleton07 getInstance(){

       return SingletonInstance.INSTANCE;

    }
}