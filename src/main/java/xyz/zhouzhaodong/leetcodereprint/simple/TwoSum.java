package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;

/**
 * 1. 两数之和
 * @author 10166815
 */
public class TwoSum {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * @param nums
     * @param target
     */
    public static int[] twoSum(int[] nums, int target) {
        // 找到和最小值相加大于目标值的下标
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int minNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                // 本元素只能加后面的元素
                int maxNum = nums[j];
                if (minNum + maxNum == target) {
                    minIndex = i;
                    maxIndex = j;
                }
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{0, 4, 3, 0}, 0)));

    }
}
