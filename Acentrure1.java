import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Acentrure1 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=8;
        int[]arr={8,4,5,3,2,6,9,1};
        int []res=product(arr,n);
    
        for(int i=0;i<arr.length;i++)
        System.out.println(res[i]+" ");
        
        
    }

        public static int[] product(int []arr,int n){
            if(n==0){
                return null;
            }
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int sumS=0;
                    int sumL=0;
                    if(arr[j]<arr[i]){
                        sumS=sumS+arr[j];
                    }
                    else{
                        sumL=sumL+arr[j];
                    }
                    int sum=(sumS*sumL);
                }
            }
        
            return arr;
        
    }
}
            
        

        
    

