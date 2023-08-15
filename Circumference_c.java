import java.util.Scanner;

public class Circumference_c {
    public static double circumfer_circle(int r){
            Double c;
            c=2*3.14*r;
            return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int r=sc.nextInt();
                double cir=circumfer_circle(r);
                System.out.println(cir);
    }
    
}
