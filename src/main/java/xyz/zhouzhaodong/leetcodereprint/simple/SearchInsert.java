package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 35. 搜索插入位置
 *
 * @author zhouzhaodong
 */
public class SearchInsert {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        // 如果数组里面没有数字那么这个数字肯定插在第0的位置上
        int subscript = 0;
        if (nums.length == 0) {
            return subscript;
        }
        //遍历这个数组，查找第一个比这个数字大的数字的位置。
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= target) {
                subscript = i;
                flag = false;
                break;
            }
        }
        if (flag) {
            subscript = nums.length;
        }
        return subscript;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}
