import java.util.Scanner;

public class patteern4 {
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        n=sc.nextInt();
        System.out.println("enter the column");
        m=sc.nextInt();
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}
