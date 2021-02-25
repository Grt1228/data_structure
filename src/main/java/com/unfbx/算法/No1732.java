package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-25
 */
public class No1732 {

    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length + 1];
        res[0] = 0;
        int max = res[0];
        for (int i = 0; i < gain.length; i++) {
            res[i + 1] = gain[i] + res[i];
            if (res[i + 1] > max) {
                max = res[i + 1];
            }
        }

        return max;
    }
}
