package CollectionFramework.Stack;

import java.util.Stack;

public class $1ReverseString {

    public static void main(String[] args) {
        String str = "GeeksQuiz";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        System.out.println(st);
        while (!st.isEmpty()) {

            System.out.print(st.pop()+" ");
        }

    }

}
