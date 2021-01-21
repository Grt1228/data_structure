package com.unfbx.设计模式.one_single;

/**
 * @Description
 *
 * 懒汉式（线程安全,双重校验）
 * 延迟加在效率较高
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest06 {

    public static void main(String[] args) {
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
        System.out.println(Singleton06.getInstance());
    }

}


class Singleton06{


    private Singleton06(){

    }

    private static Singleton06 singleton;


    public static synchronized Singleton06 getInstance(){
        if(singleton == null){
            synchronized (Singleton06.class){
                if(singleton == null){
                    singleton = new Singleton06();
                }
            }

        }
       return singleton;

    }
}