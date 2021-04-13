package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-13
 */
public class offer22 {

    public static void main(String[] args) {
        ListNode heap1 = new ListNode(4);
        ListNode heap2 = new ListNode(5);
        ListNode heap3 = new ListNode(1);
        ListNode heap4 = new ListNode(9);
        heap1.next = heap2;
        heap2.next = heap3;
        heap3.next = heap4;
        getKthFromEnd(heap1,2);
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        int i = 0;
        while (head != null){
            i+=1;
            head = head.next;
        }

        int x = i-k;

        while (temp != null && x > 0){
            x-=1;
            temp = temp.next;
        }

        return temp;
    }
}
