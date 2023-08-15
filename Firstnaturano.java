import java.util.Scanner;

public class Firstnaturano {
    
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter the no");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println("first natural no are:"+i); //first natural no
           // System.out.println("sum of first natural are:"+sum);
        }
        System.out.println(sum);

        
    }
}
