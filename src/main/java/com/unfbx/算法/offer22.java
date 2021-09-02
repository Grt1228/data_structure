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
        getKthFromEnd1(heap1,2);
    }

    public static ListNode getKthFromEnd2(ListNode head, int k){
        //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0 ){
            fast = fast.next;
            k--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode getKthFromEnd1(ListNode head, int k){
        //先求出总长度
        ListNode temp = head;
        int sum = 0;
        while(head != null){
            head = head.next;
            sum+=1;
        }
        //求出正数第几
        k = sum - k ;
        for(int i = 0 ;i <k ;i++){
            temp = temp.next;
        }
        return temp;
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
