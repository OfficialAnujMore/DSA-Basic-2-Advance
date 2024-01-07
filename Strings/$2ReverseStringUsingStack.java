// The time complexity of the code is O(n), where n is the length of the input string. This is because the code uses recursion to reverse the string, and in each recursive call, it processes one character of the string. Therefore, the number of recursive calls is equal to the length of the string.

// The space complexity of the code is also O(n), where n is the length of the input string. This is because in each recursive call, a new substring is created, which requires additional space. Therefore, the maximum depth of the call stack is equal to the length of the string, resulting in O(n) space complexity.

package Strings;

public class $2ReverseStringUsingStack {

    private static String usingCallStack(String str) {

        if (str.length() == 0) {
            return "";
        }
        return usingCallStack(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        String str = "Anuj";

        System.out.println(usingCallStack(str));
    }

}
