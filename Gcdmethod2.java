import java.util.Scanner;

public class Gcdmethod2 {
    public static void main(String[] args) {
        int n1,n2;
        int n;
    
        System.out.println("enter the two number");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        int g=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0 && n2%i==0){
               // System.out.println(i);

                g=i;

            }
           // System.out.println(i);


        }
        System.out.println(g);

    }
    
}
