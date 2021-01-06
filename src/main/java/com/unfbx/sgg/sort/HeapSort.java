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
        int[] array = {4, 6, 8, 5, 9};
        heapSort1(array);
    }

    /**
     * jdk实现
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        //大根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);

        for (int i : array) {
            priorityQueue.offer(i);
        }
        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }
    }

    public static void heapSort1(int[] array) {
        int temp = 0;
        System.out.println("堆排序~~~~~~~~~~~~~~~~~~");

        //将无序的序列构建成一个堆，根据升序降序构造成大顶堆和小顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }


        //将堆顶元素于末尾元素交换，讲最大的元素沉到数组末端
        //重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个序列有序

        for (int j = array.length - 1; j > 0; j--) {
            //交换
            temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            adjustHeap(array, 0, j);
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 将一个数组（二叉树），调整成一个大顶堆
     * <p>
     * 功能：完成将以i对应的非叶子节点的树调整为大顶堆
     * <p>
     * 举例：int arr[] = {4,6,8,5,9}; =>i = 1=>adjustHeap=>得到{4，9，8，5，6}
     * <p>
     * 如果需要再次调整，adjustHeap 传入的是i = 0=>得到{4，9，8，5，6} => {9，6，8，5，4}
     *
     * @param array  待调整的数组
     * @param i      表示非叶子节点在数组中的索引
     * @param length 表示对多少个元素继续调整，length是逐渐减少的
     */
    private static void adjustHeap(int[] array, int i, int length) {

        int temp = array[i];//先取出当前元素的值，保存到临时变量

        //开始调整
        //1.k = i*2+1  ,k是i节点的左子结点

        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && array[k] < array[k + 1]) {//说明左子结点的值小于右子结点的值
                k++;//k指向右子结点
            }

            if (array[k] > temp) {//如果子结点大于父结点
                array[i] = array[k];//把较大的值赋给当前节点
                i = k;//!!! i指向k，继续循环比较
            } else {
                break;//！
            }
        }

        //当for结束时候，我们已经将以i为父结点的树的最大值，放到了最顶端
        array[i] = temp;//将temp值放到调整后的位置
    }


}
