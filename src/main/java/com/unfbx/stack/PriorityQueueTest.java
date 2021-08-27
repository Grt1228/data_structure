package com.unfbx.stack;

import java.security.SecureRandom;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @Description
 * @Author Grt
 * @Date 2021-08-27
 */
public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(((o1, o2) -> o1-o2));

        queue1.add(10);
        queue1.add(15);
        queue1.add(13);
        queue1.add(14);
        queue1.add(21);
        queue1.add(20);

        System.out.println(queue1.peek());
        System.out.println(queue1.element());
        System.out.println("-----------------------------------");

        while(queue1.size() > 0 ){
            System.out.println(queue1.remove());
        }
        System.out.println("-----------------------------------");
    }

    private static void method1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        medianFinder.addNum(-2);

        medianFinder.addNum(-3);
        medianFinder.addNum(-4);
        medianFinder.addNum(-5);
        System.out.println(1);
        System.out.println(medianFinder.findMedian());
    }
}

class MedianFinder {

    //从小到大排序
    private Queue<Integer> minQueue;
    //从大到小排序
    private Queue<Integer> maxQueue;

    /** initialize your data structure here. */
    public MedianFinder() {
        minQueue  = new PriorityQueue<>(((o1, o2) -> o2-o1));
        maxQueue= new PriorityQueue<>(((o1, o2) -> o1-o2));
    }

    public void addNum(int num) {
        maxQueue.add(num);
        //始终保持minQueue的size>=maxQueue的size
        if(maxQueue.size() > minQueue.size()){
            minQueue.add(maxQueue.poll());
        }
    }

    public double findMedian() {
        if(minQueue.size() > maxQueue.size()){
            return minQueue.peek();
        }
        return (minQueue.peek() + maxQueue.peek()) / 2.0;
    }
}
