import java.util.Scanner;

public class Factorial {
    public static void printfactorial(int n){
        //Scanner sc=new Scanner(System.in);
        if(n<0){
            System.out.println("invalid numbers");
        }
        int i, fact=1;
        for(  i=n;i>=1;i--);
        {
            fact=fact*i;
        }
        System.out.println(fact);
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int i=sc.nextInt();
        printfactorial(n);
       // factorial(n);
       // factorial(n);
    }
    }

