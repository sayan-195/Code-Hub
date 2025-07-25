import java.util.Stack;

public class Stack9 {

    static int removeBrackets(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check open or close bracket
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        return st.size();

    }

    public static void main(String[] args) {
        String str = "))(()()(";
        int ans = removeBrackets(str);
        System.out.println(ans);
    }
}
