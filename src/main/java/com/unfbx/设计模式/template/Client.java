package com.unfbx.设计模式.template;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-07
 */
public class Client {


    public static void main(String[] args) {
        //制作红豆豆浆

        SoyaMilk red = new RedSoyaMilk();
        red.make();
    }
}
