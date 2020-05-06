package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 28. 实现 strStr()
 *
 * @author zhouzhaodong
 */
public class StrStr {

    /**
     * 实现 strStr() 函数。
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {

        // 如果needle为空，我们需要返回0
        if ("".equals(needle)) {
            return 0;
        }
        // 如果needle的长度大于haystack的长度肯定返回-1
        if (needle.length() > haystack.length()) {
            return -1;
        }
        // 对haystack进行循环截取needle长度的字符串，判断是否相等
        for (int i = 0; i < haystack.length(); i++) {
            int end = i + needle.length();
            // 截取最后一位超过haystack的长度就跳出循环
            if(end > haystack.length()){
                break;
            }
            String change = haystack.substring(i, end);
            // 截取的字符串和needle相等就返回截取字符串的首位下标
            if(needle.equals(change)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("q", "q"));
    }

}
