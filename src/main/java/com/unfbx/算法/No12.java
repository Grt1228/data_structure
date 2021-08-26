package com.unfbx.算法;

/**
 * @Description
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * @Author Grt
 * @Date 2021-08-26
 */
public class No12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        int[] numArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            while (num >= numArray[i]){
                num -= numArray[i];
                res.append(strArray[i]);
            }
        }
        return res.toString();
    }
}
