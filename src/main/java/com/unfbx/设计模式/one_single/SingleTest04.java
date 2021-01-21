package com.unfbx.设计模式.one_single;

/**
 * @Description
 *
 * 懒汉式（线程安全,加synchronized关键字）
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest04 {

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


class Singleton04{


    private Singleton04(){

    }

    private static Singleton04 singleton;


    public static synchronized Singleton04 getInstance(){
        if(singleton == null){
            singleton = new Singleton04();
        }
       return singleton;

    }
}