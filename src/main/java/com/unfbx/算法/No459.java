package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-01
 */
public class No459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaaaaaaaaab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        //abc abc abc abc
        for (int i = 0; i < s.length() / 2; i++) {
            String temp = s.substring(0, i+1);
            int length1 = s.length() / 2;
            int length2 = s.length() / 2;
            while (length1 >= temp.length() || length2 <= temp.length()) {
                if (s.substring(0, length1).indexOf(temp) >= 0 && s.substring(length2).indexOf(temp) >= 0) {
                    length1--;
                    length2++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
