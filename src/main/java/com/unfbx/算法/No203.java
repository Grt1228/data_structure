package com.unfbx.算法;

/**
 * @Description
 * //删除链表中等于给定值 val 的所有节点。
 * //
 * // 示例:
 * //
 * // 输入: 1->2->6->3->4->5->6, val = 6
 * //输出: 1->2->3->4->5
 * @Author Grt
 * @Date 2021-01-18
 */
public class No203 {

    public static void main(String[] args) {
        ListNodeOOOO l1 = new ListNodeOOOO(1);
        ListNodeOOOO l11 = new ListNodeOOOO(1);
        ListNodeOOOO l12 = new ListNodeOOOO(2);
        ListNodeOOOO l13 = new ListNodeOOOO(3);
        ListNodeOOOO l14 = new ListNodeOOOO(3);
        l1.next = l11;
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        System.out.println(removeElements(l1,3));
    }

    public static ListNodeOOOO removeElements(ListNodeOOOO head, int val) {

        //创建一个虚拟头结点
        ListNodeOOOO dummyNode=new ListNodeOOOO(val-1);
        dummyNode.next=head;
        ListNodeOOOO prev=dummyNode;
        //确保当前结点后还有结点
        while(prev.next!=null){
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else{
                prev=prev.next;
            }
        }
        return dummyNode.next;

    }
}

class ListNodeOOOO {
    int val;
    ListNodeOOOO next;

    ListNodeOOOO(int x) {
        val = x;
    }
}