package com.unfbx.算法;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description
 * @Author Grt
 * @Date 2021-08-27
 */
public class No215 {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
