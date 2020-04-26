package xyz.zhouzhaodong.leetcodereprint.difficulty;

import java.util.Arrays;

/**
 * 4. 寻找两个有序数组的中位数
 *
 * @author zhouzhaodong
 */
public class FindMedianSortedArrays {

    /**
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     * 你可以假设 nums1 和 nums2 不会同时为空。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // 首先合并两个数组
        int[] dd = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, dd, 0, nums1.length);
        System.arraycopy(nums2, 0, dd, nums1.length, nums2.length);
        // 重新排序
        Arrays.sort(dd);
        int num = dd.length / 2;
        double d;
        if(num * 2 == dd.length){
            // 这里是两个中位数相加然后取平均数
            d = (double) (dd[num] + dd[num - 1]) / 2;
        } else {
            // 这里是奇数只有一个中位数
            d = dd[num];
        }
        return d;

    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,5},new int[]{}));
    }

}
