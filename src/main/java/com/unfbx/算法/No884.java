package com.unfbx.算法;

import java.util.*;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-02
 */
public class No884 {

    public static void main(String[] args) {
        /**
         * "s z z z s"
         * "s z ejt"
         */
        //System.out.println(uncommonFromSentences("this apple is sweet","this apple is sour"));
        //System.out.println(uncommonFromSentences("apple apple","banana"));
        System.out.println(uncommonFromSentences("s z z z s","s z ejt"));
    }


    public static String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();


        String[] aArray = A.split(" ");
        String[] bArray = B.split(" ");

        for (String str : aArray){
            if(map.get(str) != null){
                map.put(str,map.get(str)+1);
                continue;
            }
            map.put(str,1);
        }
        for (String str : bArray){
            if(map.get(str) != null){
                map.put(str,map.get(str)+1);
                continue;
            }
            map.put(str,1);
        }
        List<String> ans = new LinkedList();
        for (String word: map.keySet()){
            if (map.get(word) == 1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
