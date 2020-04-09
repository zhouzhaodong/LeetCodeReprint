package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;
import java.util.Stack;

/**
 * 739. 每日温度
 * @author zhouzhaodong
 */
public class DailyTemperatures {

    /**
     * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     *
     * @param T
     * @return
     */
    public static int[] dailyTemperatures(int[] T) {
        // 这里需要用到栈，将温度的下标依次的放入到栈中，如果遇到比之前高的温度就可以根据下标计算时间
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.empty()){
                if(T[i] > T[stack.peek()]){
                    a[stack.peek()] = i - stack.peek();
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

}
