import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n=153,temp,r,arm=0;
        temp=n;
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;

            n=n/10;
        }
        if(temp==n){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }

    }
}
