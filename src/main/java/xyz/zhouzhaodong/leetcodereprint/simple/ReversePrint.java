package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 *
 * @author zhouzhaodong
 */
public class ReversePrint {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        // 利用栈的后进先出即可
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] num = new int[stack.size()];
        int m = 0;
        while (!stack.isEmpty()){
            num[m] = stack.pop();
            m ++;
        }
        return num;
    }

}
