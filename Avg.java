import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Avg {
    public static void main(String[] args) {
        int a,b,c,d,e, sum;
        double avg;
        System.out.println("enter the 5 no:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt(); 
        sum=a+b+c+d+e;
        System.out.println("sum of marks are:"+ " "+sum);
        avg=sum/5;
        System.out.println("avg are :"+ " "+avg);
    }
}
