import java.util.Scanner;

public class Avgofarray{
    public static void main(String[] args) {
        float avg;
            int sum=0;
            
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[5];
            System.out.println("enter the element of array");
            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
    
            }System.out.print("arraya are:");
            for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
    
        }
       // System.out.println("sum of array are:");
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
           // System.out.print("sum of element are"+sum);
    
    
        }
        System.out.println("sum of element are:"+" "+sum+" ");
        avg=sum/5;

        System.out.print("average of element are:"+" "+avg+" ");
    
  //  avg=sum/5;

    }
        
}   

    
