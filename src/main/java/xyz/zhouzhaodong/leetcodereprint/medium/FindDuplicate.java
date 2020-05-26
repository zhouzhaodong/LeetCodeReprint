package xyz.zhouzhaodong.leetcodereprint.medium;

/**
 * 287. 寻找重复数
 *
 * @author 84266
 */
public class FindDuplicate {

    /**
     * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
     *
     * @param nums 输入数组
     * @return
     */
    public static int findDuplicate(int[] nums) {

        // 双重for循环即可
        int num = 0;
        a:
        for (int i = 1; i <= nums.length; i++) {
            // 记录出现的次数，每次开始先归零
            int time = 0;
            for (int j = 0; j < nums.length; j++) {
                int two = nums[j];
                // 如果相等次数就加一
                if (i == two) {
                    time += 1;
                }
                // 次数大于等于两次的话就退出循环，返回出现次数大于两次的值
                if(time >= 2){
                    num = i;
                    break a;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

}
