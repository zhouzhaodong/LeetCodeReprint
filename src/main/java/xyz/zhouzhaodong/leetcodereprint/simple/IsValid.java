package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.Stack;

/**
 * 20. 有效的括号
 * @author zhouzhaodong
 */
public class IsValid {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if("".equals(s)){
            return true;
        }
        // 使用栈
        Stack<String> stack = new Stack<>();
        String[] a = s.split("");
        if(a.length % 2 != 0){
            return false;
        }
        String left1 = "(";
        String left2 = "{";
        String left3 = "[";
        String right1 = ")";
        String right2 = "}";
        String right3 = "]";
        // 循环
        for(String str : a){
            if(stack.empty()){
                stack.push(str);
                continue;
            }
            if(left1.equals(stack.peek()) && str.equals(right1)){
                stack.pop();
                continue;
            }
            if(left2.equals(stack.peek()) && str.equals(right2)){
                stack.pop();
                continue;
            }
            if(left3.equals(stack.peek()) && str.equals(right3)){
                stack.pop();
                continue;
            }
            stack.push(str);
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([)"));
    }

}
