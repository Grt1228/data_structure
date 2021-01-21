package com.unfbx.设计模式.one_single;

/**
 * @Description
 * 懒汉式（线程不安全）
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest03 {

    public static void main(String[] args) {
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
        System.out.println(Singleton03.getInstance());
    }

}


class Singleton03{


    private Singleton03(){

    }

    private static Singleton03 singleton;


    public static Singleton03 getInstance(){
        if(singleton == null){
            singleton = new Singleton03();
        }
       return singleton;

    }
}