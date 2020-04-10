package xyz.zhouzhaodong.leetcodereprint.medium;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 *
 * @author zhouzhaodong
 */
public class TopKFrequent {
    /**
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     * <p>
     * 示例 1:
     * 输入: nums = [1,1,1,2,2,3], k = 2
     * 输出: [1,2]
     *
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {

        // 首先我们需要先通过map将数据进行整理
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int a = map.get(num) == null ? 0 : map.get(num);
            map.put(num, a + 1);
        }
        // 使用优先队列进行数据的整理，优先队列默认排序是从高到低的
        Queue<Integer> queue = new PriorityQueue<>(
                // 按照出现频率从低到高排序
                Comparator.comparingInt(map::get)
        );
        // 需要将数据循环放入优先队列中
        for (Integer a : map.keySet()) {
            queue.add(a);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        List<Integer> list = new ArrayList<>(k);
        // 循环添加k个值进入list中,返回即可
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3}, 2));
    }

}
