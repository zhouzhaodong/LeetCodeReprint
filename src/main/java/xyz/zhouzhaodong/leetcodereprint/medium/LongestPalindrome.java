package xyz.zhouzhaodong.leetcodereprint.medium;

/**
 * 5. 最长回文子串
 *
 * @author zhouzhaodong
 */
public class LongestPalindrome {

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     *
     * @param s 原始字符串
     * @return 最长的回文子串
     */
    public static String longestPalindrome(String s) {

        if(s == null || s.length() <= 1){
            return s;
        }
        // 从头进行字符串拆分，然后对已经拆分的字符串进行翻转比较
        String longest = "";
        int num = 0;
        // 从头开始
        for (int i = 0; i < s.length(); i++) {
            // 结尾
            for (int j = i; j < s.length(); j++) {
                StringBuilder stringBuilder = new StringBuilder(s.substring(i, j));
                String old = String.valueOf(stringBuilder);
                String reverse = String.valueOf(stringBuilder.reverse());
                if (old.equals(reverse)) {
                    // 相等就说明是回文，需要判断长度
                    if (old.length() > num) {
                        longest = old;
                        num = old.length();
                    }
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome(null));
    }

}
