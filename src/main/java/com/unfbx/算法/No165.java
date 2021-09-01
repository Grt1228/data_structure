package com.unfbx.算法;

import java.util.Arrays;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-01
 */
public class No165 {
    public static void main(String[] args) {
        compareVersion("1.1.0", "1.1");
    }

    public static int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");

        for (int i = 0; i < Math.max(s1.length, s2.length); i++) {
            //边界问题
            int temp1 = 0;
            int temp2 = 0;
            temp1 = i >= s1.length ? 0 : Integer.valueOf(s1[i]);
            temp2 = i >= s2.length ? 0 : Integer.valueOf(s2[i]);
            if(temp1 > temp2){
                return 1;
            }
            if(temp1 < temp2){
                return -1;
            }
        }

        return 0;
    }
}
