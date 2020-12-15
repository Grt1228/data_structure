package com.unfbx.算法;

import java.util.ArrayList;

/**
 * @Description
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 *
 * 示例 1:
 *
 * 输入: N = 10
 * 输出: 9
 * 示例 2:
 *
 * 输入: N = 1234
 * 输出: 1234
 * 示例 3:
 *
 * 输入: N = 332
 * 输出: 299
 * 说明: N 是在 [0, 10^9] 范围内的一个整数。
 * 1    0001
 * 2    0010
 * 3    0011
 * 4    0100
 *
 * @Author Grt
 * @Date 2020-12-15
 */
public class No738 {

    public static int monotoneIncreasingDigits(int n) {
        if(n < 10 ){
            return n;
        }

        int temp = n;
        for (int i = temp; i >= 0; i--) {
            int NNN = i;
            int num = 0;

            while(NNN > 0){
                int ys = 0;
                if(i == NNN){
                    ys = NNN%10;
                    NNN = NNN/10;
                    num = ys;
                    continue;
                }
                ys = NNN%10;
                if(num >= ys){
                    num = ys;
                    NNN = NNN/10;
                    continue;
                }
                break;
            }
            if(NNN == 0){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(747131058));
    }

}
