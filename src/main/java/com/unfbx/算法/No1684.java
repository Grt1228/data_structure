package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 *
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 *
 * 请你返回 words 数组中 一致字符串 的数目。
 *
 * 示例 1：
 *
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 * 示例 2：
 *
 * 输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * 输出：7
 * 解释：所有字符串都是一致的。
 * 示例 3：
 *
 * 输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * 输出：4
 * 解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
 *  
 * 提示：
 *
 * 1 <= words.length <= 104
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * allowed 中的字符 互不相同 。
 * words[i] 和 allowed 只包含小写英文字母。
 *
 * @Author Grt
 * @Date 2021-01-06
 */
public class No1684 {


    public static void main(String[] args) {
        //allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        String[] array = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad",array));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        //map用数组代替效率会提升
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<allowed.length();i++){
            map.put(allowed.charAt(i),1);
        }
        int res = 0;
        for (String temp : words){
            boolean flag = true;
            for (int i = 0 ;i<temp.length();i++){
                if(map.get(temp.charAt(i)) == null){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += 1;
            }
        }


        return res;
    }

    public static int countConsistentStrings1(String allowed, String[] words) {
        char[] chars = allowed.toCharArray();
        int res = 0;
        for (String word : words) {
            for (char aChar : chars) {
                word = word.replaceAll(String.valueOf(aChar),"");
            }
            if ("".equals(word)){
                res++;
            }
        }
        return res;
    }
}
