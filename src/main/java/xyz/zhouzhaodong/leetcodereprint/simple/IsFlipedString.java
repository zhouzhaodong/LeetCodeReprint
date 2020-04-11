package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 面试题 01.09. 字符串轮转
 * @author zhouzhaodong
 */
public class IsFlipedString {

    /**
     * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
     *
     * 示例1:
     *  输入：s1 = "waterbottle", s2 = "erbottlewat"
     *  输出：True
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isFlipedString(String s1, String s2) {
        // 首先判断字符段长度是否相等
        if (s1.length() != s2.length()){
            return false;
        }
        // 我们可以将s2*2，判断生成的字符串中是否包含s1
        s2 += s2;
        return s2.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(isFlipedString("waterbot", "erbottlewat"));
    }

}
