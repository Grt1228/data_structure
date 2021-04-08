package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-08
 */
public class No169 {

    public static void main(String[] args) {
        //int[] array = {2, 2, 1, 1, 1, 2, 2};
        int[] array = {3,2,3};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[1];
        }
        int temp = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n) && map.get(n) >= temp) {
                return n;
            }
            int flag = map.containsKey(n) ? map.get(n) + 1 : 1;
            map.put(n, flag);
        }
        return 0;
    }

    public int majorityElement1(int[] num) {
        int major = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                //前面都消完了，在重新赋值
                count++;
                major = num[i];
            } else if (major == num[i]) {
                //自己人，count就加1
                count++;
            } else {
                //不是自己人就同归于尽，消掉一个
                count--;
            }
        }
        return major;
    }

}
