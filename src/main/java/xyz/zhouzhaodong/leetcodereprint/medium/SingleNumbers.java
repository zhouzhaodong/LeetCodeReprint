package xyz.zhouzhaodong.leetcodereprint.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * 面试题56 - I. 数组中数字出现的次数
 *
 * @author 84266
 */
public class SingleNumbers {

    /**
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * 示例 1：
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     *
     * @param nums
     * @return
     */
    public static int[] singleNumbers(int[] nums) {
        // 这里我首先想到的解决方案就是先将数组进行排序，然后用栈进行操作
        Stack<Integer> stack = new Stack<>();
        // 数组排序
        Arrays.sort(nums);
        // 循环数组
        for (int num : nums) {
            // 如果为空就直接添加然后跳过此次循环
            if (stack.isEmpty()) {
                stack.push(num);
                continue;
            }
            // 如果栈最上面的值和现在数组循环的值相等就弹出，不相等就添加进栈
            if (stack.peek() == num) {
                stack.pop();
            } else {
                stack.push(num);
            }

        }
        // 新建一个数组用来存放处理后的数据
        int[] all = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            all[i] = stack.pop();
            i++;
        }
        return all;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumbers(new int[]{4,1,4,6})));
    }

}
