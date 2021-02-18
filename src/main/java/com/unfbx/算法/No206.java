package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-09
 */
public class No206 {


    public ListNode reverseList(ListNode head) {

        while (head.next != null){
            head.next = null;
        }
        return null;
    }
}
