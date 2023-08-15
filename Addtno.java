import java.util.Scanner;

public class Addtno{
    public static void main(String[] args) {
        System.out.println("enter the three numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int add=a+b+c;
        System.out.println("addition is:"+add);

    }
}