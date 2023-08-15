//import java.util.Scanner;

public class Duplicate_array {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

       // int arr[]=new int[6];


    int arr[]={2,3,3,4};
        //System.out.println("Enter the array element:");
        //for(int i=0;i<=arr.length;i++){
          //  arr[i]=sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;j++){
                if(arr[i]==arr[j]&& i!=j)
                    System.out.println(arr[j]+ " ");
                
            }

            
        }
    }
    
}
