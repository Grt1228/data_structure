package com.unfbx.设计模式.adapter;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-22
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {


    @Override
    public int output5V() {
        //获取220V电压

        int output220V = output220V();
        //转换为5v
        int dstV = output220V / 44;
        return dstV;
    }
}
