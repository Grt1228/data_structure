package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-20
 */
public class No35 {

    public static void main(String[] args) {
        int[] nums= {1,3,5,6};
        System.out.println(searchInsert(nums,4));
    }


    public static int searchInsert(int[] nums, int target) {


        if(nums == null || nums.length == 0 || nums[0] >= target){
            return 0;
        }
        if(nums[nums.length-1] < target){
            return nums.length;
        }

        return binarySelect(nums,0,nums.length-1,target);
    }

    private static int binarySelect(int[] nums, int left, int right, int target) {
        if(left > right){
            return left;
        }
        int mid = (left+right)/2;

        if(target > nums[mid]){
            return binarySelect(nums,mid+1,right,target);
        }else if(target < nums[mid]){
            return binarySelect(nums,left,mid-1,target);
        }else {
            return mid;
        }
    }
}
