// Insertion at any index in stack

import java.util.*;
public class Stack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println("Enter the position you want to insert the element : ");
        int pos = sc.nextInt();
        System.out.println("Enter the number You want to insert : ");
        int n = sc.nextInt();
        Stack<Integer> rt = new Stack<>();

        while(st.size()>pos-1){
            rt.push(st.pop());
        }
        st.push(n);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.err.println(st);
    }
}

