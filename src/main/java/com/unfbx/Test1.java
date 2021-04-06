package com.unfbx;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Grt
 * @Date 2021-03-05
 */
public class Test1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        HashMap<Long,Long> map = new HashMap<>();
        System.out.println("第一种方法总共次数："+helper(5000,map));
        long l1 = System.currentTimeMillis();
        System.out.println("第一种方法耗时："+(l1 - l));

//        long l2 = System.currentTimeMillis();
//        System.out.println("第二种方法总共次数："+aaa(50));
//        long l3 = System.currentTimeMillis();
//        System.out.println("第二种方法耗时："+(l3 - l2));
    }

    public static long helper(long n,HashMap<Long,Long> map){
        if(n <= 1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }else{
            long value = (helper(n-1, map) + helper(n-2, map));
            map.put(n, value);
            return value;
        }
    }


    public static long aaa(long tj) {

        if (tj == 0) {
            return 0;
        }
        if (tj == 1) {
            return 1;
        }
        if (tj == 2) {
            return 2;
        }
        return aaa(tj - 1) + aaa(tj - 2);
    }

}
