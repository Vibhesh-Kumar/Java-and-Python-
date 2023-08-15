import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("entr the no:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("before swappin"+" "+a+ " "+b);
        //temp=a;
        a=b;
        //b=temp;
        b=a;
        System.out.println("After swappin"+" "+a+ " "+b);

    }
    
}
