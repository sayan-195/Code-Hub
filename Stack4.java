//Displaying a Stack with the help of Array
import java.util.Stack;
public class Stack4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int n = st.size();
        int arr[]= new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
