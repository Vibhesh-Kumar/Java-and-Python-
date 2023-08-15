import java.util.Scanner;
 ///sum of array are is 
public class Sumofarray {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the element of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }System.out.println("arraya are:");
        for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println("sum of array are:");
    for(int i=0;i<5;i++){
        sum=sum+arr[i];
       // System.out.print("sum of element are"+sum);


    }
    System.out.print("sum of element are"+" "+sum+" ");

}
}
