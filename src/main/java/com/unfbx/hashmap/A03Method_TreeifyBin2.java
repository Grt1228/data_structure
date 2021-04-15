package com.unfbx.hashmap;

import java.util.HashMap;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-15
 */
public class A03Method_TreeifyBin2 {
    public static void main(String[] args) {
        HashMap<A03Bean, Integer> hashMap = new HashMap<>();
        hashMap.put(new A03Bean(4), 0);
        hashMap.put(new A03Bean(8), 1);
        hashMap.put(new A03Bean(12), 2);
        hashMap.put(new A03Bean(16), 3);
        hashMap.put(new A03Bean(20), 4);
        hashMap.put(new A03Bean(24), 5);
        hashMap.put(new A03Bean(28), 6);
        hashMap.put(new A03Bean(32), 7);
        hashMap.put(new A03Bean(36), 8);
        hashMap.put(new A03Bean(40), 9);
        hashMap.put(new A03Bean(44), 10);

        System.out.println("hashMap.size = " + hashMap.size());

        //查看是否所有对象都放到HashMap中了：
        for(A03Bean key : hashMap.keySet()) {
            System.out.println(key.number);
        }
    }
}
