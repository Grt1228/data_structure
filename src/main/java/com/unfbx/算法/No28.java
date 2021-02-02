package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-02
 */
public class No28 {

    public static void main(String[] args) {
        /**
         * // 输入: haystack = "hello", needle = "ll"
         * //输出: 2
         *
         * // 输入: haystack = "aaaaa", needle = "bba"
         * //输出: -1
         */
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));
        System.out.println(strStr("1","1"));
        System.out.println(strStr("abc","c"));
        System.out.println(strStr("mississippi","issi"));
        System.out.println(strStr("mississippi","pi"));
    }

    public static int strStr(String haystack, String needle) {

        if(needle == null || "".equals(needle)){
            return 0;
        }

        if(needle.equals(haystack)){
            return 0;
        }
        int length =needle.length() > 1 ?  haystack.length() - needle.length()+1 : haystack.length();
        for (int i = 0 ;i< length;i++){
            String temp = haystack.substring(i, i + needle.length());
            if(needle.equals(temp)){
                return i;
            }
        }
        return -1;
    }
}
