import java.util.Scanner;

public class array1{ 
    public static void main(String[] args) {
       // System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
            int size;
            size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<=size;i++){
            arr[i]=sc.nextInt();
          //  System.out.println(arr[i]+" ");
        }
        // to print the number in array
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");

        }

    }
    
}
