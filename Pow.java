import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

public class Pow {
    public static void power(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            //int resrult=1;
            result=result*x;
        
        }
        System.out.println(result);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int x=sc.nextInt();
        int n=sc.nextInt();
            power(x,n);

    }
    
    
}

