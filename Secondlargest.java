import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
        int temp;
        // System.out.println("enter the array of size:");

        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // System.out.println("enter the array of element:");
        // int arr[]=new int[size];
        // arr[i]=sc.nextInt();
        int arr[]={3,5,2,7,1,9};

        for( int i=0;i<arr.length;i++){
            // arr[i]=sc.nextInt();

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==1){  // fast execution it sort only two position 
                break;
            }
        }
        System.out.println("Secont largest element is:"+arr[1]);
    }

    
}
