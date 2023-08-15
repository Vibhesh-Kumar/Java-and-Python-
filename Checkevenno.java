import java.util.Scanner;

public class Checkevenno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the no");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even no");
        }
        else {
            System.out.println("not even no");
        }

    }
}
