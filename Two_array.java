import java.util.Scanner;

public class Two_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows no");
        int rows=sc.nextInt();
        System.out.println("enter the cols no");
        int cols=sc.nextInt();
    
        int arr[][]=new int[rows][cols];
        //input

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("enter the no x");
        
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               // int x=sc.nextInt();
                if(arr[i][j]==x)

                System.out.print("x found at  position"+i+" "+j);
        }
     //   System.out.println();
    }
    
    }
    }
    

