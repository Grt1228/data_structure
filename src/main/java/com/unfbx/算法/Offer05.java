package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-12
 */
public class Offer05 {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }
}
