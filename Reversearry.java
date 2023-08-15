import java.util.Scanner;
//reverse the arrays the given arrays
public class Reversearry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int size;
        int arr[]=new int[5];
        System.out.println("enter the element in the arrays");
       // size=sc.nextInt();
        //input
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            //System.out.println(arr[i]+" ");
        }
        
        //output
        System.out.println("reverse element is:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            
    }

            
}
}
