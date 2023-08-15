import java.util.Arrays;

public class sqrtroot {
    public static void main(String[] args) {
            int arr[]={-4,-3,-1,2,3,6};
            System.out.println( "array before sort");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
        sortsquare(arr);
        System.out.println(" ");
        System.err.println("array after sort:");

        for(int i=0;i<arr.length;i++)
            //arr[i]=arr[i]*arr[i];
        System.out.print(arr[i]+" ");
        
    
        }
    
    
    public static void sortsquare(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
            Arrays.sort(arr);
        }

    }
}


    

