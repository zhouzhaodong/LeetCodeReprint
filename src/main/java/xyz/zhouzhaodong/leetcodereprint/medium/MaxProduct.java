package xyz.zhouzhaodong.leetcodereprint.medium;

/**
 * 152. 乘积最大子数组
 *
 * @author zhouzhaodong
 */
public class MaxProduct {

    /**
     * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
     *
     * @param nums
     * @return
     */
    public static int maxProduct(int[] nums) {

        // 如果数组只有一位数的话，直接返回即可
        if (nums.length == 1) {
            return nums[0];
        }
        // 如果有多位数的话就进行遍历
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            // 先拿出当前元素
            int acc = nums[i];
            // 如果大于最大值就赋值给最大值
            if (acc > max) {
                max = acc;
            }
            // 向后进行遍历
            for (int j = i + 1; j < nums.length; j++) {
                // 求积
                acc *= nums[j];
                // 如果大于最大值就赋值给最大值
                if (acc > max) {
                    max = acc;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2, 0, -14}));
    }

}
