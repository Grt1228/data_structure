package com.unfbx.设计模式.adapter;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-22
 */
public class Phone {

    /**
     * 充电
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压5v可以充电~~~~~~~~~~~~~~~");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V不能充电~~~~~~~~~~~");
        }
    }
}
