import java.util.Scanner;

public class ASCIIofchar {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter the character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int a=ch;
        System.out.println("ASXII value of "+ch+" is"+" "+a);
    }
}
