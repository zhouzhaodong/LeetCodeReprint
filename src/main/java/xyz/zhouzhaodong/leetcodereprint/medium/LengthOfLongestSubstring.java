package xyz.zhouzhaodong.leetcodereprint.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 无重复字符的最长子串
 *
 * @author zhouzhaodong
 */
public class LengthOfLongestSubstring {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {

        // 先判断字符串长度
        if ("".equals(s)) {
            return 0;
        }
        // 利用list进行循环遍历
        List<String> list = new ArrayList<>();
        String[] a = s.split("");
        list.add(a[0]);
        int num = list.size();
        for (int i = 1; i < a.length; i++) {
            String change = a[i];
            for (int j = 0; j < list.size(); j++) {
                String str = list.get(j);
                if (change.equals(str)) {
                    // list需要删除之前所有的数据
                    list = list.subList(j + 1,list.size());
                    list.add(change);
                    if(list.size() > num){
                        num = list.size();
                    }
                    break;
                }
                if (j == list.size() - 1) {
                    list.add(change);
                    if(list.size() > num){
                        num = list.size();
                    }
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }

}
