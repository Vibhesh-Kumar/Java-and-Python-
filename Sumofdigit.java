import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        int n,count=0;
        int r,sum=0;
    System.out.println("enter the no:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while(n>0){
        r=n%10;
        sum=sum+r;
        n=n/10;  //count++;
    }
System.out.println("sum of digits are:"+sum);
}
    }

