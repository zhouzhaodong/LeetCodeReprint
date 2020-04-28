package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 7. 整数反转
 *
 * @author 84266
 */
public class Reverse {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 示例 1:
     * 输入: 123
     * 输出: 321
     *  示例 2:
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * 输入: 120
     * 输出: 21
     * 注意:
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        // 首先判断是否为负数
        boolean flag = true;
        // 转化为String类型
        String num = String.valueOf(x);
        if (x < 0) {
            flag = false;
            // 负数就把负号去掉
            num = num.substring(1);
        }
        // 用StringBuilder进行字符串的反转
        StringBuilder stringBuilder = new StringBuilder(num);
        stringBuilder.reverse();
        // 转化为long类型的正数
        long a = Long.parseLong(stringBuilder.toString());
        // 与最大值最小值进行比较，超出就返回0
        long min = (long)Math.pow(2,31);
        long max = (long)Math.pow(2,31) - 1;
        if(flag){
            // 正数
            if(a > max){
                return 0;
            } else {
                return (int) a;
            }
        } else {
            // 负数
            if(a > min){
                return 0;
            } else {
                return (int) - a;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

}
