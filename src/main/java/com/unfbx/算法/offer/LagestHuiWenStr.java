package com.unfbx.算法.offer;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-27
 */
public class LagestHuiWenStr {

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }

    public static int longestPalindromeSubseq(String s) {
        int[] arr = new int[26];
        for (int i = 0 ;i< s.length() ;i++){
            arr[s.charAt(i) - 'a']++;
        }
        int sum = 0;
        int res = 0;
        int max = 0;
        for (int i = 0 ;i< arr.length;i++){
            sum+=arr[i];
            if( arr[i] % 2 == 0){
                res+=arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        if(sum > res){
            res+=1;
        }
        return res > max ? res : max;
    }
}
