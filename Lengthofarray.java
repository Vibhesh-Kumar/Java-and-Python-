import java.util.Scanner;

public class Lengthofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[4];
        System.out.println("enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("length of the array is:"+arr.length);

    }
    
}
