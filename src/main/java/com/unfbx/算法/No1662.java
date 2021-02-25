package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-25
 */
public class No1662 {

    public static void main(String[] args) {
        String[] a = {"ab","c"};
        String[] b = {"a","bc"};
        String[] c = {"a","b","c"};

        System.out.println(arrayStringsAreEqual(a,b));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0, j = 0; i < word1.length || j < word2.length; i++, j++) {
            if(i < word1.length){
                s1.append(word1[i]);
            }
            if(j < word2.length){
                s2.append(word2[i]);
            }
        }

        return s1.toString().equals(s2.toString());
    }
}
