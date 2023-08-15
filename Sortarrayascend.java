import java.util.Scanner;

public class Sortarrayascend {
    public static void main(String[] args) {
        int temp;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        //int arr[]=new int[5];
        System.out.println("enter the element in array is:");
        //input
        for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("sorted array is:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
    
                }
            }

            }
          //  System.out.println(arr[i]+" ");
        
        
    
    for(int i=0;i<arr.length;i++){
    
        System.out.print(arr[i]+" ");
}
}
}