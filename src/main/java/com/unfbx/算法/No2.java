package com.unfbx.算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @Author Grt
 * @Date 2020-12-30
 */
public class No2 {

    public static void main(String[] args) {
        ListNodeO l1 = new ListNodeO(2);
        ListNodeO node2 = new ListNodeO(4);
        ListNodeO node3 = new ListNodeO(3);
        l1.next = node2;
        node2.next = node3;

        ListNodeO l2 = new ListNodeO(5);
        ListNodeO node4 = new ListNodeO(6);
        ListNodeO node5 = new ListNodeO(4);
        l2.next = node4;
        node4.next = node5;


        addTwoNumbers1(l1, l2);
        //System.out.println(getVal(l1, l2));

    }


    public static ListNodeO addTwoNumbers1(ListNodeO l1, ListNodeO l2) {
        int num1 = 0;
        int i = 0;
        while (true) {
            if (l1.next != null ) {
                num1 += (l1.val * Math.pow(10, i));
                l1 = l1.next;
            }
            if (l2.next != null) {
                num1 += (l2.val * Math.pow(10, i));
                l2 = l2.next;
            }
            i++;
            if(l1.next  == null && l2.next == null){
                break;
            }

        }
        ListNodeO res = new ListNodeO();
        ListNodeO temp = new ListNodeO();
        res = temp;
        while (true) {
            if (num1 > 0) {
                temp.val =  num1 % 10;

                ListNodeO node = new ListNodeO();
                temp.next = node;
                temp = temp.next;

                num1 = num1 / 10;
                continue;
            }
            break;
        }
        return res;
    }

    // 获取值
    public static int getVal(ListNodeO node1, ListNodeO node2){
        System.out.println("执行！");
        Boolean isBigTen = false;
        int temp = 0;
        int val1 = 0;
        int val2 = 0;
        while (node1 != null || node2 != null){
            val1 = node1 != null ? node1.val : 0;
            val2 = node2 != null ? node2.val : 0;
            if(isBigTen){
                temp = temp * 10 +
                        ((val1 + val2 + 1)  >= 10 ? (val1 + val2 + 1 - 10) : (val1 + val2 + 1));
                isBigTen = ((val1 + val2 + 1)  >= 10);
            } else {
                temp = temp * 10 +
                        ((val1 + val2)  >= 10 ? (val1 + val2 - 10) : (val1 + val2));
                isBigTen = ((val1 + val2 )  >= 10);
            }
            if (node1 != null) {
                node1 = node1.next;
            }
            if (node2 != null){
                node2 = node2.next;
            }
        }
        if (isBigTen){
            temp = temp * 10 + 1;
        }
        return temp;
    }

    public static ListNodeO addTwoNumbers(ListNodeO l1, ListNodeO l2) {
        int num1 = 0;
        int i = 0;
        while (true) {
            num1 += (l1.val * Math.pow(10, i));
            i++;
            if (l1.next != null) {
                l1 = l1.next;
                continue;
            }
            break;
        }

        int num2 = 0;
        i = 0;
        while (true) {
            num2 += (l2.val * Math.pow(10, i));
            i++;
            if (l2.next != null) {
                l2 = l2.next;
                continue;
            }
            break;
        }
        num1 = num1 + num2;//807
        List<Integer> list = new ArrayList<>();

        ListNodeO res = new ListNodeO();
        ListNodeO temp = new ListNodeO();
        res = temp;
        while (true) {
            if (num1 > 0) {
                temp.val =  num1 % 10;

                ListNodeO node = new ListNodeO();
                temp.next = node;
                temp = temp.next;

                num1 = num1 / 10;
                continue;
            }
            break;
        }
        return res;
    }
}

class ListNodeO {
    int val;
    ListNodeO next;

    ListNodeO() {
    }

    ListNodeO(int val) {
        this.val = val;
    }

    ListNodeO(int val, ListNodeO next) {
        this.val = val;
        this.next = next;
    }


    public void sout(ListNodeO nodeO) {
        if (nodeO.next == null) {
            System.out.println(nodeO.val);
            return;
        }
        sout(nodeO.next);
        System.out.println(nodeO.val);

    }
}
