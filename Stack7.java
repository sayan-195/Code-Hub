//Stack implementation with Array
public class Stack7 {
     public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("stack is Full !");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");

            }
            System.out.println();
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        int size(){
            return idx;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.pop();
        System.out.println(st.peek());
    }
}
