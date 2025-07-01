public class Array24 {

    public static void prefixSum(int arr[]){
        int n=arr.length;

        for(int i =1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        printArray(arr);
    }

    public static void printArray(int arr[]){ 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        prefixSum(arr);
    }
}
