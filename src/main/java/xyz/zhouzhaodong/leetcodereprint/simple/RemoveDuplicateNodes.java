package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 02.01. 移除重复节点
 * @author zhouzhaodong
 */
public class RemoveDuplicateNodes {

    /**
     * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
     *
     * @param head
     * @return
     */
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            // 包含关系
            if (!list.contains(head.val)) {
                // 不包含就添加
                list.add(head.val);
            }
            head = head.next;
        }
        ListNode listNode = new ListNode(0);
        ListNode ll = listNode;
        for (Integer integer : list) {
            ll = ll.next = new ListNode(integer);
        }
        return listNode.next;
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
        System.out.println(removeDuplicateNodes(listNode(new int[]{17, 23, 15, 30, 21, 5, 20, 14, 5, 9, 22, 6, 22, 20, 14, 12, 4, 21, 27, 5, 4, 21, 27, 0, 14, 21, 17, 27, 6, 12, 28, 17, 29, 8, 17, 13, 7, 26, 7, 31, 27, 8, 31, 19, 5, 23, 9, 0, 22, 0, 26, 30, 14, 10, 6, 8, 16, 24, 15, 21, 2, 3, 5, 15})));
    }

}
