package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 27. 移除元素
 *
 * @author zhouzhaodong
 */
public class RemoveElement {

    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }
        // 这里需要进行元素的调换
        int j = nums.length - 1;
        int i = 0;
        a:for (; i < nums.length; i++) {
            int num = nums[i];
            if(num == val){
                // 进行元素的调换,就是找最后面的进行调换，如果下标一致的话就退出
                while(nums[j] == val){
                    j --;
                    if(i >= j){
                        break a;
                    }
                }
                nums[i] = nums[j];
                nums[j] = num;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,2,2}, 2));
    }

}
