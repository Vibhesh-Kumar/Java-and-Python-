import java.util.Scanner;

public class Minarray {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int size;
        // size=sc.nextInt();
        // int arr[]=new int[size];
        // //input
        // for( int i=1;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        //output
        int arr[]={3,9,2,6,8};
        int min=arr[0];
        // int min=arr[0];
        for( int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);
}
}