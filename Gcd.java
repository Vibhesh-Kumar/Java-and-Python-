import java.util.Scanner;


//method1
public class Gcd{
    public static void gcd(int a,int b){
        while(a!=b){
        if(a>b){
            a=a-b;
            System.out.println(a);
           // return a;

        }
        else {

            b=b-a;
            System.out.println(b);
           // return b ;

        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd(a,b);
       // System.out.println(g);

    }

    
}
