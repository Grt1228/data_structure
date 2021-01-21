package com.unfbx.设计模式.one_single;

/**
 * @Description
 * 饿汉式静态代码块
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest02 {

    public static void main(String[] args) {
        System.out.println(Singleton02.getInstance());
        System.out.println(Singleton02.getInstance());
        System.out.println(Singleton02.getInstance());
        System.out.println(Singleton02.getInstance());
        System.out.println(Singleton02.getInstance());
    }
}

class Singleton02{

    //私有化构造函数
    private Singleton02(){

    }

    private static Singleton02 singleton;

    static {
        singleton = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return singleton;
    }



}
