package com.unfbx.设计模式.one_single;

/**
 * @Description
 *
 * 懒汉式（线程安全,枚举实现）
 * 延迟加在效率较高
 * @Author Grt
 * @Date 2021-01-18
 */
public class SingleTest08 {

    public static void main(String[] args) {
        System.out.println(Singleton08.INSTANCE);
        System.out.println(Singleton08.INSTANCE);

    }

}

/**
 * JDK1.5中新增加的枚举实现丹丽模式,能够避免多线程同步问题,能够防止反序列化重新创建对象
 */

enum  Singleton08{

    INSTANCE,
    ;

}