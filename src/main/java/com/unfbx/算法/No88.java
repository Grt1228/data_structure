package com.unfbx.算法;

import java.util.Arrays;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-02
 */
public class No88 {

    public static void main(String[] args) {
        /**
         * //输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
         * //输出：[1,2,2,3,5,6]
         */
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge1(nums1, 1, nums1, 1);
        System.out.println(1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        //双指针，一个指向nums1末位，一个指向nums2末位
        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length -1 ;
        while(p1 >= 0 && p2 >= 0){
            //      nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }else {
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }

        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }

}
