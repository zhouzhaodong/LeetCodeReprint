package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;

/**
 * 面试题03. 数组中重复的数字
 *
 * @author zhouzhaodong
 */
public class FindRepeatNumber {

    /**
     * 找出数组中重复的数字。
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                num = nums[i];
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

}
