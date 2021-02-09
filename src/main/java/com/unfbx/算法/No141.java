package com.unfbx.算法;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-09
 */
public class No141 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node2;
        System.out.println(hasCycle1(node1));
    }
    //hash表
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }

        return false;
    }
    //快慢指针
    public static boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode low = head;
        ListNode fast = head.next;
        while (low != fast ){
            if( fast == null || fast.next == null){
                return false;
            }

            low = low.next;
            fast = fast.next.next;
        }
        return true;
    }


}
