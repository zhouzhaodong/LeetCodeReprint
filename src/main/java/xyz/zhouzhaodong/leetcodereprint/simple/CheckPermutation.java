package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author 10166815
 */
public class CheckPermutation {

    /**
     * 判断是否互为字符重排
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkPermutation(String s1, String s2) {
        // 转化为list然后排序后进行对比
        String[] a = s1.split("");
        String[] b = s2.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        return Objects.equals(Arrays.toString(a), Arrays.toString(b));
    }

    public static void main(String[] args) {

        System.out.println(checkPermutation("asdfg", "dsfga"));

    }
}
