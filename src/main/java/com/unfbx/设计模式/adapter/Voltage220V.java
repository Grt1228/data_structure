package com.unfbx.设计模式.adapter;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-22
 */
public class Voltage220V {


    public int output220V(){
        int src = 220;
        System.out.println("电压："+src+"V");

        return src;
    }
}
