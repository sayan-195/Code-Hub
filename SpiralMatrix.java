public class SpiralMatrix {

    static void printSpiralOrder(int arr[][]){
        int strow=0,stcol=0,endrow=arr.length-1,endcol=arr[0].length-1;

        while(strow<=endrow && stcol<=endcol){
            //print the first row
        for(int i = stcol;i<=endcol;i++){
            System.out.print(arr[strow][i]+" ");
        }
        strow++;
        //print the last column
        for(int j=strow;j<=endrow;j++){
            System.out.print(arr[j][endcol]+" ");
        }
        endcol--;
        //print the bottom 
        for(int i=endcol;i>=stcol;i--){
            System.out.print(arr[endrow][i]+" ");
        }
        endrow--;
        //print the left part
        for(int i = endrow;i>=strow;i--){
            System.out.print(arr[i][stcol]+" ");
        }
        stcol++;
        }
        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        printSpiralOrder(arr);
    }

}
