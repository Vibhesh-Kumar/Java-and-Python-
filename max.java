import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int i,size;
        // size=sc.nextInt();
        // int arr[]=new int[size];
        // //input
        // for( i=1;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // //output
        int arr[]={7,32,6,2,6,9,55};
        int max=arr[0];
        // int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
           // max=arr[i];
        
        System.out.println(max);
        // int min=arr[0]
        // for( i=1;i<arr.length;i++){
        //     if(arr[i]<min){
        //     min=arr[i];
        // }
        // }
        // System.out.println( "min element are"+" "+min);
    }
    
}
