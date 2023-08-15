import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class VorC {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter the charactr:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
        System.out.println("voweal"+" "+ch);
        else {
            System.out.println("constant"+ " "+ch);
        }
    }
}
