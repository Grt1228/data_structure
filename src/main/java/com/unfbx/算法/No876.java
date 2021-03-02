package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-03-02
 */
public class No876 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(4);
        ListNode l14 = new ListNode(5);
        ListNode l15 = new ListNode(5);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        System.out.println(middleNode(l1));
    }

    public static ListNode middleNode(ListNode head) {


        ListNode temp = head;
        int i = 0;

        while (head != null) {
            i += 1;
            head = head.next;
        }

        int j = 0;
        if (i % 2 == 0) {
            j = i / 2 +1;
        } else {
            j = (i / 2) + 1;
        }

        while (temp != null) {

            j -= 1;
            if(j == 0){
                break;
            }
            temp = temp.next;

        }
        return temp;
    }
}
