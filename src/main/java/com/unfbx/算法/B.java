package com.unfbx.算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-09
 */
public class B {
    /**
     * 【腾讯】java 实现寻找所有子序列输出。例如给一个字符串abc,它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种,
     *
     * @param args
     */

    public static void main(String[] args) {
        //test("abcd");

        String str = "abc";
        pringAllSub(str.toCharArray(),0,"");
    }

    public static Set<String> test(String str) {
        Set<String> res = new HashSet<>();
        res.add("");
        char[] chars = str.toCharArray();
        if(chars.length == 1){
            res.add(String.valueOf(chars[0]));
            return res;
        }

        for (int i = 0 ;i<chars.length;i++){
            res.add(String.valueOf(chars[i]));
            for (int j = i+1;j<chars.length;j++){
                res.add(str.substring(i,j+1));
                res.add(String.valueOf(chars[i])+String.valueOf(chars[j]));
            }
        }
        return res;
    }

    public static void pringAllSub(char[] str,int i,String res) {
        if (i == str.length) {
            System.out.println(res);
            return;
        }
        //两种情况
        pringAllSub(str, i + 1, res);
        pringAllSub(str, i + 1, res + str[i]);
    }
}
