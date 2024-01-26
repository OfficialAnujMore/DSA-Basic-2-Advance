package CollectionFramework.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class $2ParenthesisChecker {

    static boolean result(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == '[' || chr == '(' || chr == '{') {
                stack.push(chr);
                continue;
            }

            char check;
            if (stack.isEmpty())
                return false;
            switch (chr) {

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(') {
                        return false;
                    }
                    break;
            }

        }

        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        // String str = "[()]{}{[()()]()}";
        // String str = "{{{([{])}}}";
        String str = "[(])";

        if (result(str)) {
            System.out.println("Valid parenthesis " + str);
        } else {
            System.out.println("Invalid parenthesis " + str);
        }
    }

}
