import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int n=sc.nextInt();
        System.out.println("ente the column");

        int m=sc.nextInt();
    
        int arr[][]=new int[n][m];
        //input

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int j=0;j<m;j++){
        for(int i=0;i<n;i++){
           // for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
    }
}


