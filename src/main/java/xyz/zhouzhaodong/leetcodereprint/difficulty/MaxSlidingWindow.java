package xyz.zhouzhaodong.leetcodereprint.difficulty;

import java.util.Arrays;

/**
 * 239. 滑动窗口最大值
 *
 * @author zhouzhaodong
 */
public class MaxSlidingWindow {

    /**
     * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回滑动窗口中的最大值。
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // 这里我们可以想我们每次拿出给定数组中的k个元素组成一个新的数组，对新数组排序后取最大值即可
        int[] newInt = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int[] kSize = new int[k];
            // 截取数组，参数分别为原数组，截取开始的下标，新数组，新数组开始的下标，新数组结束的下标
            System.arraycopy(nums, i, kSize, 0, k);
            Arrays.sort(kSize);
            newInt[i] = kSize[k -1];
        }
        return newInt;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

}
