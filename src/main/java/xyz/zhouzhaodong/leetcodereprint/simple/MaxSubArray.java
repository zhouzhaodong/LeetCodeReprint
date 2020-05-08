package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 53. 最大子序和
 *
 * @author 84266
 */
public class MaxSubArray {

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {

        // 需要先将数组第一个元素赋值给最大和
        int all = nums[0];
        // 从第一个元素开始循环数组
        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            int two = 0;
            // 如果当前元素大于最大和就赋值给最大和
            if(one > all){
                all = one;
            }
            for (int j = i + 1; j < nums.length; j++) {
                // 从上层for循环的开始元素向后叠加
                two += nums[j];
                // 求和之后进行对比，如果大于最大和就赋值给最大和
                int onceAll = one + two;
                if(onceAll > all){
                    all = onceAll;
                }
            }
        }
        return all;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1}));
    }

}
