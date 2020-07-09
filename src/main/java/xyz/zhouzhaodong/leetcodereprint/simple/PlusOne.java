package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Arrays;

/**
 * 66. 加一
 *
 * @author zhouzhaodong
 */
public class PlusOne {

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int flag = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i];
            if(num == 9){
                // 该位赋值0，上进一位
                digits[i] = 0;
            } else {
                // 如果不为9则直接加一结束循环
                digits[i] = digits[i] + 1;
                break;
            }
            if(i == 0){
                // 如果到最后还是没有跳出循环则说明是极端情况
                flag = 1;
            }
        }
        if(flag == 1){
            // 极端情况，需要新增一位
            int num = digits.length + 1;
            int[] newInt = new int[num];
            // 首位赋值1，其余位置为0
            newInt[0] = 1;
            return newInt;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }

}
