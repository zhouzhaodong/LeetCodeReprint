package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 9. 回文数
 *
 * @author zhouzhaodong
 */
public class IsPalindrome9 {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String[] a = String.valueOf(x).split("");
        int num = a.length;
        int min = 0;
        int max = num - 1;
        while (min < max) {
            if (!a[min].equals(a[max])) {
                return false;
            }
            min++;
            max--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1001));
    }

}
