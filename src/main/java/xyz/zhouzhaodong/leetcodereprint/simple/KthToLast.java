package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * @author zhouzhaodong
 */
public class KthToLast {

    /**
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     *
     * @param head
     * @param k
     * @return
     */
    public static int kthToLast(ListNode head, int k) {

        // 首先将链表转化为list，然后通过list进行查找即可
        List<Integer> list = new ArrayList<>();
        ListNode list1 = new ListNode(0);
        ListNode list2 ;
        while(head != null){
            int num = head.val;
            list2 = head;
            list1.next = list2;
            list.add(num);
            head = head.next;
        }
        return list.get(list.size()-k);
    }
    /**
     * 生成链表
     *
     * @param a
     * @return
     */
    public static ListNode listNode(int[] a) {
        ListNode listNode = new ListNode(0);
        ListNode ll = listNode;
        for (Integer integer : a) {
            ll = ll.next = new ListNode(integer);
        }
        return listNode.next;
    }

    /**
     * 链表实体类
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode listNode = listNode(new int[]{1,2,3,4,5});
        System.out.println(kthToLast(listNode, 2));
    }

}
