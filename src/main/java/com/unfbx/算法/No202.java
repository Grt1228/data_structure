package com.unfbx.算法;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-18
 */
public class No202 {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while (sum != 1) {
            sum = 0;
            while (n > 0) {
                int i = n % 10;
                n = n / 10;
                sum += (i * i);
            }
            n = sum;
            if(!set.add(sum)){
                return false;
            }
        }

        return true;
    }
}
