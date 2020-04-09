package xyz.zhouzhaodong.leetcodereprint.medium;

/**
 *
 * @author 10166815
 */
public class AddTwoNumbers {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return new ListNode(0);
        }
        // 首先我们需要考虑的就是我们先获取到第一位进行相加，第一位就是余数
        ListNode listNode = new ListNode(0);
        ListNode ll = listNode;
        int num = 0;
        while (l1 != null || l2 != null || num != 0) {
            int one = l1 == null ? 0 : l1.val;
            int two = l2 == null ? 0 : l2.val;
            ll.next = new ListNode((one + two + num) % 10);
            ll = ll.next;
            num = (one + two + num) / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return listNode.next;
    }


    /**
     * 单链表
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

    /**
     * 生成单链表
     * @param intSet
     * @return
     */
    public static ListNode getListNode(int[] intSet) {
        ListNode listNode = new ListNode(0);
        ListNode ll = listNode;
        for (int i : intSet) {
            ll.next = new ListNode(i);
            ll = ll.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = getListNode(new int[]{1, 2, 3});
        ListNode l2 = getListNode(new int[]{9, 9, 9});
        System.out.println(addTwoNumbers(l1, l2));
    }

}
