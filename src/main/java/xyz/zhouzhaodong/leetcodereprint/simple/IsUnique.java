package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 * @author 10166815
 */
public class IsUnique {

    /**
     * 判断字符串中的字符是否唯一
     *
     * @param str
     * @return
     */
    public static boolean isUnique(String str) {
        // 在这里我们可以用Set进行操作，将字符串进行拆分放入Set中
        String[] a = str.split("");
        Set<String> set = new HashSet<>(Arrays.asList(a));
        // 如果长度一致就是唯一，不一致就是不唯一
        return a.length == set.size();
    }

    public static void main(String[] args) {
        // 测试字符串是否唯一
        String str = "abcdefga";
        boolean b = isUnique(str);
        System.out.println(b);
    }
}
