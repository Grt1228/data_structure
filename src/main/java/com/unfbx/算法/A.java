package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-09
 */
public class A {

    //评测题目: 编写一个demo，模拟3个售票窗口售卖100张票，
    //每个窗口的单次等待时间不变，如第一个窗口卖一张票需要3秒，
    //第二个窗口卖一张票需要5秒，第三个窗口卖一张票需要7秒，
    //如何最快的卖掉全部票（提示：三个窗口可同时进行售卖）。

    public static void main(String[] args) {
        System.out.println(minTime(9, 1));
    }

    public static int minTime(int sum, int res) {

        while (sum > 0 ) {
            res++;
            if (sum > 0 && (res % 3) == 0) {
                sum -= 1;
            }
            if (sum > 0 && (res % 5) == 0) {
                sum -= 1;
            }
            if (sum > 0 && (res % 7) == 0) {
                sum -= 1;
            }
        }
        if (sum > 0) {
            return minTime(sum, res);
        }
        return res;
    }
}
