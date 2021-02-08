package com.unfbx.设计模式.template;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-07
 */
public abstract class SoyaMilk {



    //不让子类覆盖
    final void make(){
        select();
        add();
        soak();
        beat();
    }

    abstract void add();

    void select(){
        System.out.println("选材~~~~~~~~~~~~~~~");

    }

    void soak(){
        System.out.println("浸泡~~~~~~~~~~~~~~~");

    }

    void beat(){
        System.out.println("制作~~~~~~~~~~~~~~~");
    }

}
