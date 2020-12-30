package com.unfbx.sgg.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Description 堆排序
 * @Author Grt
 * @Date 2020-12-30
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {4,6,8,5,9};
        heapSort(array);
    }

    /**
     * jdk实现
     * @param array
     */
    public static void heapSort(int[] array){
        //大根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2) -> o1 - o2);

        for(int i : array){
            priorityQueue.offer(i);
        }
        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }
    }


}
