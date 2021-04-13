package com.unfbx.算法;

/**
 * @Description 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-04-09
 */
public class No283 {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int fast = 1;//
        int slow = 0;

        while (fast < nums.length && slow <nums.length) {
            if(nums[fast]==0 || nums[slow] ==0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
            }
            if(nums[fast] == 0){
                fast += 1;
            }
            if(nums[slow] != 0 ){
                slow += 1;
            }
        }
    }

}
