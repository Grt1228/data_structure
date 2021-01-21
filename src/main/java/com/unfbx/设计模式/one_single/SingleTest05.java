package com.unfbx.设计模式.one_single;

/**
 * @Description
 *
 * 懒汉式（线程安全,synchronized代码快）
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest05 {

    public static void main(String[] args) {
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
        System.out.println(Singleton05.getInstance());
    }

}


class Singleton05{


    private Singleton05(){

    }

    private static Singleton05 singleton;


    public static synchronized Singleton05 getInstance(){
        if(singleton == null){
            synchronized (Singleton05.class){
                singleton = new Singleton05();
            }

        }
       return singleton;

    }
}