package com.unfbx.算法;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Description 第i个人的体重为people[i]，每艘船可以承载的最大重量为limit。
 * <p>
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为limit。
 * <p>
 * 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/boats-to-save-people
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-08-26
 */
public class No881 {

    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        System.out.println(Arrays.toString(people));
        System.out.println(numRescueBoats(people,3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        //先排序
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int result = 0;
        //在比较
        while (start <= end) {
            if(people[start] + people[end] <= limit){
                //最重+最轻可以同事坐船
                start++;
                end--;
                result++;
                continue;
            }
            end--;
            result++;
        }
        return result;
    }
}
