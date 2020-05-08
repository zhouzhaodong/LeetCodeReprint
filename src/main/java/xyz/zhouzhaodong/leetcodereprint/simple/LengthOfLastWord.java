package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 58. 最后一个单词的长度
 * @author 84266
 */
public class LengthOfLastWord {

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     * 如果不存在最后一个单词，请返回 0 。
     * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {

        // 如果是null就返回0
        if(s == null){
            return 0;
        }
        // 去掉空格
        s = s.trim();
        // 根据空格进行拆分生成数组
        String[] a = s.split(" ");
        int num = a.length;
        if(num == 0){
            return 0;
        } else {
            return a[num - 1].length();
        }

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello   World"));
    }

}
