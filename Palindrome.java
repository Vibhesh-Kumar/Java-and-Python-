import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n=121,temp,s=0,r;
        temp=n;
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(temp==s){
            System.out.println("panlindrome no");

        }
        else{
        System.out.println("not palindrome no");
    }
}
}