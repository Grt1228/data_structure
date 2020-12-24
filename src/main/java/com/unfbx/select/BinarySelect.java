package com.unfbx.select;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 二分查找
 * @Author Grt
 * @Date 2020-12-24
 */
public class BinarySelect {

    public static void main(String[] args) {
        int[] array = {1,8,10,89,1000,1000,1234};

        //System.out.println(binarySelect(array,0,array.length-1,1234));
        System.out.println(binarySelect1(array,0,array.length-1,1000).toString());
    }

    /**
     * 二分查找
     * @param array
     * @param left
     * @param right
     * @param num
     * @return
     */
    public static int binarySelect(int[] array ,int left,int right, int num){
        if(left > right){
            return -1;
        }
        int mid = (left+right)/2;
        if(num > array[mid]){
            return binarySelect(array,mid+1,right,num);
        }else if(num < array[mid]){
            return binarySelect(array,left,mid-1,num);
        }else {
            return mid;
        }

    }

    /**
     * 二分查找，返回所有相同数字的索引下标
     * @param array
     * @param left
     * @param right
     * @param num
     * @return
     */
    public static List binarySelect1(int[] array , int left, int right, int num){
        if(left > right){
            return new ArrayList();
        }
        int mid = (left+right)/2;
        if(num > array[mid]){
            return binarySelect1(array,mid+1,right,num);
        }else if(num < array[mid]){
            return binarySelect1(array,left,mid-1,num);
        }else {
            List<Integer> list = new ArrayList<>();
            list.add(mid);
            int temp = mid-1;
            //向左边找
            while (true){
                if(temp < 0){
                    break;
                }
                if(array[temp] == num){
                    list.add(temp);
                }

                temp-=1;
            }
            temp = mid +1;
            //向右边找
            while (true){
                if(temp > array.length-1){
                    break;
                }
                if(array[temp] == num){
                    list.add(temp);
                }

                temp+=1;
            }
            return list;
        }

    }


}
