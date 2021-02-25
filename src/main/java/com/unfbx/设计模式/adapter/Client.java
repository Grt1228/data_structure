package com.unfbx.设计模式.adapter;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-22
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=======适配器模式==========");

        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
