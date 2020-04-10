package xyz.zhouzhaodong.leetcodereprint.medium;

import java.util.Objects;

/**
 * 面试题 01.05. 一次编辑
 *
 * @author zhouzhaodong
 */
public class OneEditAway {

    /**
     * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
     * <p>
     * 示例 1:
     * 输入:
     * first = "pale"
     * second = "ple"
     * 输出: True
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean oneEditAway(String first, String second) {

        // 解题思路如下：
        // 1.首先需要判断两个字符串相差的字符必须要在1个以内
        // 2.三种情况进行判断（1,删除一位 2,增加一位 3,修改一位）
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        String[] firstStr = first.split("");
        String[] secondStr = second.split("");
        int firstNum = first.length();
        int secondNum = second.length();
        int j = 0;
        int k = 0;
        for (int i = 0; i < Math.max(firstNum, secondNum); i++) {
            if (firstNum > secondNum) {
                //删除
                if (j < secondNum && !Objects.equals(firstStr[i], secondStr[j])) {
                    j--;
                    k++;
                }
            } else if (firstNum < secondNum) {
                //增加
                if (j < firstNum && !Objects.equals(firstStr[j], secondStr[i])) {
                    j--;
                    k++;
                }
            } else {
                //修改
                if (!Objects.equals(firstStr[i], secondStr[j])) {
                    k++;
                }
            }
            j++;
        }
        return k <= 1;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("a", "bb"));
    }

}
