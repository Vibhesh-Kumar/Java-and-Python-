import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        double r,a,b;
        char op;
        
        System.out.println("enter the no a:");
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        System.out.println("enter the no b:");
        
        b=s.nextInt();
        System.out.println("enter the operator +,_,*,/,%");
        op=s.next().charAt(0);        
        if (op=='+') {
            r=a+b;
            System.out.println(r);
        }
            else if (op=='-') {
                r=a-b;
                System.out.println(r);
            }
                else if (op=='*'){
                    r=a*b;
                    System.out.println(a*b);
                }
                    else if (op=='/') {
                    r= a/b;
                        System.out.println(r);
                    }
                        else if(op=='%') {
                            r=a%b;
                            System.out.println(r);
                        }
                            else {
                                System.out.println("other value");
            
        }
        
    
    }
    
}
