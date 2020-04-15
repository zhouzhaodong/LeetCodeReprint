package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 *
 * @author zhouzhaodong
 */
public class GetLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] a = new int[k];
        System.arraycopy(arr, 0, a, 0, k);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLeastNumbers(new int[]{}, 0)));
    }

}
