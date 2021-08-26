package com.unfbx.算法;

/**
 * @Description 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @Author Grt
 * @Date 2021-02-09
 */
public class No206 {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(4);
        ListNode l14 = new ListNode(5);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        System.out.println(reverseList(l1));
    }


    public static ListNode reverseList(ListNode head) {
        ListNode current = null;//当前指针节点
        ListNode prev = head; //前指针节点

        while (prev != null) {
            ListNode nextTemp = prev.next;
            prev.next = current;
            current = prev;
            prev = nextTemp;
        }
        return current;
    }
}
