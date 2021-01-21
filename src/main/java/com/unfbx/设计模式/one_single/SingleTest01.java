package com.unfbx.设计模式.one_single;

/**
 * @Description
 * 饿汉式静态常量
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest01 {


    public static void main(String[] args) {
        System.out.println(Singleton01.getInstance());
        System.out.println(Singleton01.getInstance());
        System.out.println(Singleton01.getInstance());
        System.out.println(Singleton01.getInstance());
    }
}

class Singleton01{



    //私有化构造器
    private Singleton01(){

    }

    //自己创建实例
    private final static Singleton01 single = new Singleton01();

    public static Singleton01 getInstance(){
        return single;
    }
}
