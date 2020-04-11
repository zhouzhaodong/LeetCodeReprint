package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 面试题 02.06. 回文链表
 * @author zhouzhaodong
 */
public class IsPalindrome {

    /**
     * 编写一个函数，检查输入的链表是否是回文的。
     * 示例 1：
     * 输入： 1->2
     * 输出： false
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        // 判断是否为空或者是否只有一个数字
        if (head == null || head.next == null) {
            return true;
        }
        // 将链表的数据取出放入list中
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            int val = head.val;
            list.add(val);
            head = head.next;
        }
        // 将list转为数组
        Object[] a = list.toArray();
        // 反转list
        Collections.reverse(list);
        // 用已有的数组和反转后的list相通位置的数字进行对比，如果不同就返回false
        for (int i = 0; i < list.size(); i++) {
            if ((int)a[i] != list.get(i)) {
                return false;
            }
        }
        return true;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
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

    public static void main(String[] args) {

        ListNode list = listNode(new int[]{-129, -129});
        System.out.println(isPalindrome(list));

    }


}
