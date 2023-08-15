import java.util.Scanner;

public class Cubeofno{
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int cube=a*a*a;
        System.out.println("Cube of number is:"+cube);
    }
}