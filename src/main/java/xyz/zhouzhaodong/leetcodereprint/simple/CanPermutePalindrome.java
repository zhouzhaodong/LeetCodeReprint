package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

/**
 * 面试题 01.04. 回文排列
 *
 * @author zhouzhaodong
 */
public class CanPermutePalindrome {

    /**
     * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
     * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
     * 回文串不一定是字典当中的单词。
     * <p>
     * 示例1：
     * <p>
     * 输入："tactcoa"
     * 输出：true（排列有"tacocat"、"atcocta"，等等）
     *
     * @param s
     * @return
     */
    public static boolean canPermutePalindrome(String s) {
        if("".equals(s)){
            return false;
        }
        // 可以先对s进行排序，然后利用栈进行操作
        String[] a = s.split("");
        Arrays.sort(a);
        Stack<String> stack = new Stack<>();
        for (String value : a) {
            if (!stack.empty() && Objects.equals(stack.peek(), value)) {
                // 如果栈不是空的并且栈最上面的值和数组的值相同就弹出
                stack.pop();
            } else {
                // 不相同就放入到栈里面
                stack.push(value);
            }
        }
        // 栈里面最多剩下一个值
        if(stack.empty()){
            return true;
        } else {
            stack.pop();
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("a"));
    }

}
