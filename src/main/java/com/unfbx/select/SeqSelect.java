package com.unfbx.select;

/**
 * @Description 线性查找
 * @Author Grt
 * @Date 2020-12-24
 */
public class SeqSelect {


    public static void main(String[] args) {
        int[] array = {1,9,8,3,10,11,999,90};
        System.out.println(seqSelect(array,10));
    }

    /**
     *
     * @param array 数组
     * @param num   需要查找的数字
     * @return  返回的小标
     */
    public static int seqSelect(int[] array,int num){

        for (int i = 0 ;i<array.length;i++){
            if(array[i] == num){
                return i;
            }
        }

        return -1;

    }
}
