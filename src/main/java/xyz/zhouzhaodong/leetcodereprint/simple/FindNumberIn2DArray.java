package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 面试题04. 二维数组中的查找
 *
 * @author zhouzhaodong
 */
public class FindNumberIn2DArray {

    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        // 暴力查找
        for (int[] m : matrix) {
            for (int value : m) {
                if (target == value) {
                    return true;
                }
            }
        }
        return false;
    }

}
