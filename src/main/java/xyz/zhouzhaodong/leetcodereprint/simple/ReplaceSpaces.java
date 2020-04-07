package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * @author 10166815
 */
public class ReplaceSpaces {

    /**
     * 编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
     * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
     *
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces(String S, int length) {
        // 直接截取给定长度的字符串进行空格替换即可
        return S.substring(0, length).replaceAll(" ", "%20");
    }

    public static void main(String[] args) {

        System.out.println(replaceSpaces("www  eeee   ", 9));

    }
}
