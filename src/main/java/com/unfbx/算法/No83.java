package com.unfbx.算法;

/**
 * @Description 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-01-18
 */
public class No83 {
    public static void main(String[] args) {
        ListNodeOOO l1 = new ListNodeOOO(1);
        ListNodeOOO l11 = new ListNodeOOO(1);
        ListNodeOOO l12 = new ListNodeOOO(2);
        ListNodeOOO l13 = new ListNodeOOO(3);
        ListNodeOOO l14 = new ListNodeOOO(3);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        System.out.println(deleteDuplicates(l1));
    }


    public static ListNodeOOO deleteDuplicates(ListNodeOOO head) {

        ListNodeOOO current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

class ListNodeOOO {
    int val;
    ListNodeOOO next;

    ListNodeOOO() {
    }

    ListNodeOOO(int val) {
        this.val = val;
    }

    ListNodeOOO(int val, ListNodeOOO next) {
        this.val = val;
        this.next = next;
    }
}