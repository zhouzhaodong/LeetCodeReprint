package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author zhouzhaodong
 */
public class RemoveDuplicates {

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        // 如果没有或者只有一个元素的话就不需要进行任何操作，直接返回数组长度即可
        if (nums.length <= 1) {
            return nums.length;
        }
        // 遍历整个数组寻找比前一个元素大的数字替换相应为止的元素即可
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > nums[i - 1]) {
                nums[a] = num;
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,3}));
    }

}
