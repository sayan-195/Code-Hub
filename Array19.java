import java.util.*;
public class Array19 {

    public static void reverseArray(int arr[],int st, int ed){
        int i=st,j=ed;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        } 
    }

    public static void rotateArray(int arr[],int k){
        k = k % arr.length;//k=3
        int n=arr.length;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
      
    }

    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.println("Input K :");
        int k = sc.nextInt();
        rotateArray(arr, k);
        printArray(arr);
    }
}
