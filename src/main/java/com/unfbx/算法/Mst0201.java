package com.unfbx.算法;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 *
 * //编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * //
 * // 示例1:
 * // 输入：[1, 2, 3, 3, 2, 1]
 * // 输出：[1, 2, 3]
 *
 * // 示例2:
 * // 输入：[1, 1, 1, 1, 2]
 * // 输出：[1, 2]
 * //
 * // 提示：
 * // 链表长度在[0, 20000]范围内。
 * // 链表元素在[0, 20000]范围内。
 *
 * // 进阶：
 * //
 * // 如果不得使用临时缓冲区，该怎么解决？
 * @Author Grt
 * @Date 2021-01-18
 */
public class Mst0201 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        System.out.println(removeDuplicateNodes2(l1));
    }

    public static ListNode removeDuplicateNodes(ListNode head) {

        if (head == null) {
            return head;
        }
        Set<Integer> occurred = new HashSet<Integer>();
        occurred.add(head.val);
        ListNode pos = head;
        // 枚举前驱节点
        while (pos.next != null) {
            // 当前待删除节点
            ListNode cur = pos.next;
            if (occurred.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;

    }

    public static ListNode removeDuplicateNodes2(ListNode head) {
        // 遍历链表，使用散列表保存已经访问的结点
        // 对新结点判断是否重复，重复则删除
        HashSet<Integer> nodeSet = new HashSet<>();
//        ListNode prev = null;
        ListNode tmp = head;
        while(tmp!=null) {
            if (nodeSet.contains(tmp.val)) {
//                prev.next = tmp.next;
                tmp.next = tmp.next.next;
            } else {
                nodeSet.add(tmp.val);
//                prev= tmp;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
