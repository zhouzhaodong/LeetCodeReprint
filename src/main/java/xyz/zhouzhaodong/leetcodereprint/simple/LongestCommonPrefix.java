package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 14. 最长公共前缀
 *
 * @author zhouzhaodong
 */
public class LongestCommonPrefix {

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {

        // 首先我们先判断数组中是否有元素
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        // 我们需要将数组中的所有元素拿出来进行对比
        StringBuilder a = new StringBuilder();
        boolean flag = true;
        int num = 0;
        while (flag) {
            for (int i = 0; i < strs.length - 1; i++) {
                // num可能会越界
                if (strs[i].split("").length <= num || strs[i + 1].split("").length <= num) {
                    flag = false;
                    break;
                }
                String before = strs[i].split("")[num];
                String rear = strs[i + 1].split("")[num];
                if (before.equals(rear)) {
                    if (i == strs.length - 2) {
                        a.append(before);
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            num++;
        }
        return a.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"",""}));
    }

}
