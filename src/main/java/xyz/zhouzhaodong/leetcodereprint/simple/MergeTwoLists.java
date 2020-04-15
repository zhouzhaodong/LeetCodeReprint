package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 21. 合并两个有序链表
 *
 * @author zhouzhaodong
 */
public class MergeTwoLists {

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

    /**
     * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 如果进行合并的话就需要用到迭代或者递归
        ListNode ll = new ListNode(0);
        ListNode l = ll;
        while (l1 != null || l2 != null) {
            // 只要有一个链表为空，即可结束循环
            if(l1 == null){
                l.next = l2;
                break;
            }
            // 因为把剩下的都赋值给l.next就行了
            if(l2 == null){
                l.next = l1;
                break;
            }
            if (l1.val > l2.val) {
                l.next = l2;
                l2 = l2.next;
            } else {
                l.next = l1;
                l1 = l1.next;
            }
            l = l.next;
        }
        return ll.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = listNode(new int[]{1, 2, 4});
        ListNode listNode2 = listNode(new int[]{1, 3, 4});
        System.out.println(mergeTwoLists(listNode1, listNode2));
    }

}
