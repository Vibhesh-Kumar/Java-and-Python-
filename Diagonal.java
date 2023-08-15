import java.util.Scanner;

public class Diagonal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the number of  row:");
        int row=sc.nextInt();
        System.out.println("Enter the number of  col:");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("Enter the element in the matrix:");
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
    
        if(row==col) {
            System.out.println("Diagonal element are :");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i==j){
                        System.out.print(arr[i][j]+" ");
                    }
                    }
        }
        }
    else {
        System.out.println("Diagonal element not possibel:");
    }
    }
}

