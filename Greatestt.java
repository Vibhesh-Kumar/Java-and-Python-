import java.util.Scanner;



public class Greatestt {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the three no:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater :"+" "+a);
        }
    
            
            else if(b>a && b>c){
            System.out.println("b is greater :"+ " "+b);
        }
        else {
            System.out.println(" c is greater ");
        }
    }
}
