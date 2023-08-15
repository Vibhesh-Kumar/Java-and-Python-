import java.util.Scanner;

//sal<10000  //tax is 0%
//sal >10000 and sal<100000 tax=10%
//sal >100000 tax =20%.

public class Taxcal {
    public static void main(String[] args) {
        int sal;
        double tax;
        System.out.println("enter the salary:");
        Scanner sc=new Scanner(System.in);
        sal=sc.nextInt();
        if(sal<10000){
        System.out.println(sal+" "+"no tax");
        }
        else if(sal>10000 && sal<100000){
            tax=sal*.10;
            System.out.println(sal +" "+tax);
        }
        else {
            tax=sal*.20;
            System.out.println(sal +" "+tax);
        }
    }
}
