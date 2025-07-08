import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //Push operation in stack
        st.push(1);
        st.push(33);
        st.push(23);
        st.push(34);
        st.push(7);
        //print the stack
        System.out.println(st);
        //pop operation in stack
        st.pop();
        System.out.println(st);
        //peek operation in stack
        System.out.println(st.peek());
        //isEmpty operation in stack 
        System.out.println(st.isEmpty());
    }
}
