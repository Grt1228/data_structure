package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-20
 */
public class No9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1210));
    }

    /**
     * 对折解法
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x > 0)) {
            return false;
        }
        int reverseNum = 0;

        while (x > reverseNum) {

            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }

        return reverseNum == x || reverseNum / 10 == x;
    }

    /**
     * 字符串解法
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {

        if (x < 0) {
            return false;
        }

        String value = String.valueOf(x);
        for (int i = 0, j = value.length() - 1; i <= j; i++, j--) {
            if (value.charAt(i) - value.charAt(j) != 0) {
                return false;
            }
        }
        return true;
    }
}
