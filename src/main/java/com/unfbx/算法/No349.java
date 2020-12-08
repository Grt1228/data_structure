package com.unfbx.算法;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 说明：
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * @Author Grt
 * @Date 2020-12-07
 */
public class No349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int i : nums1){
            set1.add(i);
        }

        for (int j : nums2){
            if(set1.contains(j)){
                set2.add(j);
            }
        }
        int[] arr = new int[set2.size()];
        int j = 0;
        for (int i : set2){
            arr[j++] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));


    }
}
