package com.unfbx.算法;

import lombok.val;

/**
 * @Description
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 *示例 1：
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-01-13
 */
public class No21 {

    public static void main(String[] args) {
        // * 输入：l1 = [1,2,4], l2 = [1,3,4]
        // * 输出：[1,1,2,3,4,4]
        ListNodeOO l1 = new ListNodeOO(1);
        ListNodeOO l11 = new ListNodeOO(2);
        ListNodeOO l12 = new ListNodeOO(4);
        l1.next = l11;
        l11.next = l12;

        ListNodeOO l2 = new ListNodeOO(1);
        ListNodeOO l21 = new ListNodeOO(3);
        ListNodeOO l22 = new ListNodeOO(4);
        l2.next = l21;
        l21.next = l22;
        System.out.println(mergeTwoLists(l1,l2));
    }

    public static ListNodeOO mergeTwoLists(ListNodeOO l1, ListNodeOO l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNodeOO res = new ListNodeOO();

        ListNodeOO resTemp = new ListNodeOO();
        resTemp = res;

        if(l1.val < l2.val){
            res.val = l1.val;
            l1 = l1.next;
        }else {
            res.val = l2.val;
            l2 = l2.next;
        }
        int count = 0;
        while (l1 != null || l2 != null){
            count++;
            if(l1 == null){
                res.next = l2;
                break;
            }
            if(l2 == null){
                res.next = l1;
                break;
            }
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
                res = res.next;
                continue;
            }
            res.next = l2;
            l2 = l2.next;
            res = res.next;

        }
        return resTemp;
    }
}
class ListNodeOO {
    int val;
    ListNodeOO next;
    ListNodeOO() {}
    ListNodeOO(int val) { this.val = val; }
    ListNodeOO(int val, ListNodeOO next) { this.val = val; this.next = next; }
}