package xyz.zhouzhaodong.leetcodereprint.medium;

/**
 * 11. 盛最多水的容器
 *
 * @author 84266
 */
public class MaxArea {

    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        // 需要进行循环遍历，循环替换即可
        int num = 0;
        // 从数组的第一位开始循环，到倒数第二位结束
        for (int i = 0; i < height.length - 1; i++) {
            // 这就是左边的边
            int outside = height[i];
            // 从外循环的下一位开始循环，到最后一位
            for (int j = i + 1; j < height.length; j++) {
                // 这就是右边的边
                int within = height[j];
                // 计算高
                int small = Math.min(outside,within);
                // 计算宽
                int wight = j - i;
                // 计算面积
                int area = small * wight;
                // 如果面积比之前的最大面积大的话就替换
                if(area > num){
                    num = area;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8}));
    }

}
