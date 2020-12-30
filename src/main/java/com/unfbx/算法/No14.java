package com.unfbx.算法;

/**
 * @Description 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * @Author Grt
 * @Date 2020-12-30
 */
public class No14 {

    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"cir","car"};
        //System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix2(strs));

        System.out.println("flower".indexOf("loa"));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String res = strs[0];

        int index = 1;
        String temp = "";
        while (index < strs.length) {
            temp = "";
            //求res和str[index]的公共前缀
            for (int i = 0; i < res.length(); i++) {
                if (i < strs[index].length() && (res.charAt(i) - strs[index].charAt(i)) == 0) {
                    temp += res.charAt(i);
                    continue;
                }
                break;
            }
            res = temp;
            index++;
        }

        return res;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        //默认为第一个字符串
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
