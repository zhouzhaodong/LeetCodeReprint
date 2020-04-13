package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 面试题 01.05. 一次编辑
 * @author zhouzhaodong
 */
public class OneEditAway {

    /**
     * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
     * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean oneEditAway(String first, String second) {

        if (first.equals(second) || Math.max(first.length(), second.length()) == 1) {
            return true;
        }
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        String[] firstStr = first.split("");
        String[] secondStr = second.split("");
        int num = Math.min(firstStr.length, secondStr.length);
        int a = 0;
        for (int i = 0; i < num; i++) {
            if (!firstStr[i].equals(secondStr[i])) {
                if ((firstStr.length > secondStr.length && firstStr[i + 1].equals(secondStr[i])) ||
                        (firstStr.length < secondStr.length && firstStr[i].equals(secondStr[i + 1]))) {
                    // 位移相等

                } else {
                    a++;
                }
            }
        }
        return a == 0;
    }

    public static void main(String[] args) {

        System.out.println(oneEditAway("", "a"));
        int[] a = new int[]{1, 3, 4, 7, 2, 5};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - i; i++) {

            }
        }

    }

}
