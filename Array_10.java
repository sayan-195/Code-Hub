//Check if an array is sorted or not 

public class Array_10 {
    public static boolean isSorted(int arr[]){

        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,6,6,6,9};
        System.out.println("Given array is SOrted : "+isSorted(arr));

    }
}
