import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
            int a,b,c;

            double Area;
            System.out.println("enter the side of the triangle ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            double s=a+b+c/2;
            Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(Area);
}
}
