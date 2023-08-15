import java.util.Scanner;

public class Addofmartrix {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
            n=sc.nextInt();
            System.out.println("ente the column");

            m=sc.nextInt();
    
        int arr[][]=new int[n][m];
        int arr2[][]=new int[n][m];
        int arr3[][]=new int[n][m];


        //input
            System.out.println("enter the first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
                System.out.println("entr the second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println(" first matrix  is : ");
        for(int i=0;i<n;i++){   
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("second matrix is :");


    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" "); 
        }
        System.out.println();
    }
    //output
    
    
System.out.println("sum of two matrix is:");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr3[i][j]=arr[i][j]+arr2[i][j];
            System.out.print(arr3[i][j]+" ");
    }
    System.out.println();
}
    }
}
