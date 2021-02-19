package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-19
 */
public class Offer64 {

    public static void main(String[] args) {
        System.out.println(sumNums(100));
    }
    //递归
    public static int sumNums(int n) {
        int sum = n;
        boolean flag = n > 0 && (sum += sumNums(n-1))>0;
        return sum;
    }
}
