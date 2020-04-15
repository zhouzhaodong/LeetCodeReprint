package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 面试题05. 替换空格
 * @author zhouzhaodong
 */
public class ReplaceSpace {

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

}
