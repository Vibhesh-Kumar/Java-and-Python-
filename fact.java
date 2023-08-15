import java.util.Scanner;



public class fact {
    public static void main(String[] args) {
        int n, fact=1;
        System.out.println("enter the no ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
}
}