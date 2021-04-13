package com.unfbx.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-13
 */
public class MyHashMap {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ooo");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        list.add("kkk");


        //长度为8是二的倍数，这样数组长度才会出现一个0111除了高位之外都是1的特征，也就是散列
        String[] tab = new String[8];

        for (String key : list) {
            int index = key.hashCode() & (tab.length - 1);//计算索引位置

            System.out.println(String.format("key=%s,index = %d", key, index));

            if(null == tab[index]){
                tab[index] = key;
                continue;
            }
            tab[index] = tab[index] + "=>" +key;//模拟链表
        }

        System.out.println(Arrays.toString(tab));

        System.out.println(tableSizeFor(17));

        /**
         * 1. 这里所有的元素存放都需要获取一个索引位置，而如果元素的位置不够
         * 散列碰撞严重，那么就失去了散列表存放的意义，没有达到预期的性
         * 能。
         * 2. 在获取索引 ID 的计算公式中，需要数组长度是 2 的倍数，那么怎么进行
         * 初始化这个数组大小。
         * 3. 数组越小碰撞的越大，数组越大碰撞的越小，时间与空间如何取舍。
         * 4. 目前存放 7 个元素，已经有两个位置都存放了 2 个字符串，那么链表越
         * 来越长怎么优化。
         * 5. 随着元素的不断添加，数组长度不足扩容时，怎么把原有的元素，拆分
         * 到新的位置上去。
         * 以上这些问题可以归纳为；扰动函数、初始化容量、负载因子、扩容方法以及链表和
         * 红黑树转换的使用等。接下来我们会逐个问题进行分析。
         */
    }

    /**
     * 扰动函数
     *
     * 使用扰动函数增加随机性，让数据均匀的散列，减少hash碰撞
     * 数据存放获取效率更佳
     * @param key
     * @param size
     * @return
     */
    public static int disturbHashIndex(String key,int size){

        return (size -1 ) & (key.hashCode() ^ (key.hashCode() >>> 16));
    }

    public static int hashIndex(String key,int size){

        return (size -1 ) & key.hashCode();
    }

    //初始化容量和负载因子

    //  new HashMap<>(17) 会默认生产大小为32的map

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= (1 << 30)) ? (1 << 30) : n + 1;
    }


}
