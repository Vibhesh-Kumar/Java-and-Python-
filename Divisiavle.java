import java.util.Scanner;

public class Divisiavle {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%5==0 ){
            System.out.println("divisiable by 5");
        }
        else {
            System.out.println("not divisiale by 5");
        }
    }
}
