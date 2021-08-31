package com.unfbx.算法;

import java.util.Arrays;

/**
 * @Description
 * @Author Grt
 * @Date 2021-08-31
 */
public class No1109 {

    public static void main(String[] args) {
//        int[][] arr1 = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
//        int[][] arr2 = {{1, 2, 10}, {2, 2, 15}};
//        corpFlightBookings2(arr1, 5);
        test();
    }

    public static void test(){
        //原数组
        int[] array = {1,2,5,3,10,100,54,66};
        System.out.println(Arrays.toString(array));

        //差分数组
        int[] tempArray = new int[8];
        tempArray[0] = array[0];
        for (int i = 1 ;i<array.length ;i++){
            tempArray[i] = array[i] - array[i-1];
        }
        System.out.println(Arrays.toString(tempArray));
        //需求一，原数组的第0-5都加上11
        tempArray[0] +=11;
        tempArray[5] -=11;
        //打印原数组
        for (int i = 1 ;i< tempArray.length ;i++){
            tempArray[i] += tempArray[i-1];
        }
        System.out.println(Arrays.toString(tempArray));

    }


    public static int[] corpFlightBookings2(int[][] bookings, int n) {
        int[] nums = new int[n];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                nums[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));

        return nums;
    }

    /**
     * @param bookings 航班预定票数
     * @param n        航班数
     * @return
     */
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];

        for (int i = 0; i < bookings.length; i++) {
            int[] temp = new int[3];
            for (int j = 0; j < bookings[i].length; j++) {
                temp[j] = bookings[i][j];
            }

            for (int k = 0; k < temp[1] - temp[0] + 1; k++) {
                result[temp[0] - 1 + k] += temp[2];
            }

        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
