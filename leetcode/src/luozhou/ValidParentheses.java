package luozhou;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author luozhou
 * @Description:leetcode算法题，验证字符串有效的括号
 * @date 2018/11/18 16:21
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        Map<String, String> params = new HashMap<>();
        params.put(")", "(");
        params.put("]", "[");
        params.put("}", "{");
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if (stack.isEmpty() && params.containsKey(str)) {
                return false;
            }
            if (!params.containsKey(str)) {
                stack.push(str);
            } else if (!stack.isEmpty() && !stack.pop().equals(params.get(str))) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]]"));
    }
}
