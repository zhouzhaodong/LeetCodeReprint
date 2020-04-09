package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 * @author zhouzhaodong
 */
public class IsAnagram {

    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        // 方法一，对两个字符串中的元素进行个数计算，第一个进行加操作，第二个进行减操作，最后对比元素是否有剩余即可
        Map<String, Integer> map = new HashMap<>();
        String[] a = s.split("");
        String[] b = t.split("");
        for (String c : a) {
            int num = map.get(c) == null ? 0 : map.get(c);
            map.put(c, num + 1);
        }
        for (String d : b) {
            int num = map.get(d) == null ? 0 : map.get(d);
            if (num > 0) {
                map.put(d, num - 1);
            } else {
                return false;
            }
        }
        for (int e : map.values()) {
            if (e > 0) {
                return false;
            }
        }
        return true;
        // 方法二，对数组进行排序，如果字符串所含字母相同的话，排序后的数组肯定相同
//        String[] a = s.split("");
//        Arrays.sort(a);
//        String[] b = t.split("");
//        Arrays.sort(b);
//        return Arrays.equals(a, b);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abb", "bba"));
    }

}
