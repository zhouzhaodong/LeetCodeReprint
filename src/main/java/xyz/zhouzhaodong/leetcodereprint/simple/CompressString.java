package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * @author zhouzhaodong
 */
public class CompressString {

    /**
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     *
     * @param s
     * @return
     */
    public static String compressString(String s) {

        // 直接进行遍历即可
        String[] a = s.split("");
        String old = "";
        int num = 1;
        StringBuilder b = new StringBuilder();
        for (String str : a) {
            if (old.equals(str)) {
                // 如果后一个字符和前一个字符相同,num增加1
                num += 1;
            } else {
                if (!"".equals(old)) {
                    // 如果不为空就拼接
                    b.append(old).append(num);
                }
                // 如果后一个字符和前一个字符不相同,num重置为1
                num = 1;
            }
            old = str;
        }
        if (!"".equals(old)) {
            // 需要拼接最后一部分
            b.append(old).append(num);
        }
        if (b.toString().length() >= s.length()) {
            // 如果缩写后的字符串长度比未缩写之前的长就返回之前的
            return s;
        }
        return b.toString();

    }

    public static void main(String[] args) {
        System.out.println(compressString("abbccd"));
    }

}
