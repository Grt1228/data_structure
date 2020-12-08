package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2020-12-07
 */
public class No242 {

    public static boolean isAnagram(String s, String t) {
        if(s==null || t==null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        int[] alpha = new int[26];
        for (char c :s.toCharArray()){
            alpha[Integer.valueOf(c)-Integer.valueOf('a')] --;

        }
        for (char c :t.toCharArray()){
            alpha[Integer.valueOf(c)-Integer.valueOf('a')] ++;

        }
        for (int c : alpha){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alpha = new int[26];
        for(int i = 0; i< s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
            alpha[t.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++) {
            if(alpha[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("a","bb"));
        System.out.println(isAnagram("anagram","nagaram"));
    }

}
