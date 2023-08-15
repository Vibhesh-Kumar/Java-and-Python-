import java.util.Scanner;

public class Calculatr {
    public static void main(String[] args) {
        int a,b;
        int op,result;
    System.out.println("enter the no a:");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    System.out.println("enter the no b:");
    b=sc.nextInt();
    System.out.println("enter the operator +,-.*,/,%");
    op=sc.next().charAt(0);
    switch(op){
        case '+':
        result=a+b;
        System.out.println(result);
        break;
        
        case '-':
        result=a-b;
        System.out.println(result);
        break;
        case '*':
        result=a*b;
        System.out.println(result);
        break;
        case '/':
        result=a/b;
        System.out.println(result);
        break;
        case '%':
        result=a%b;
        System.out.println(result);
        break;
    }


    }
}
