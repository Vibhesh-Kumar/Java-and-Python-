import java.util.Scanner;

public class Copyarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        System.out.println("Enter the element in array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();

        }
        System.out.println("first arry element are:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");

    }
    System.out.println("copy of the element are :");
    for(int i=0;i<arr1.length;i++){
        //System.out.println(arr1[i]+" ");
        arr2[i]=arr1[i];
        System.out.print(arr2[i]+" ");
    }
}
}
