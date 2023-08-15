import java.util.Scanner;

public class swapwithouttird {
    public static void main(String[] args) {
        int a,b;
        System.out.println("entr the no:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("before swappin"+" "+a+ " "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        
        System.out.println("After swappin"+" "+a+ " "+b);

    }
    }

