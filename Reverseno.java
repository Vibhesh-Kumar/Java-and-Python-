import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int input=sc.nextInt(); 

        //method 1
        // StringBuffer sb=new StringBuffer(String.valueOf(input));
        //         StringBuffer rev=sb.reverse();

        //         System.out.println(" Reverse number is :"+rev);

        StringBuilder sb1=new StringBuilder();
        sb1.append(input);
        StringBuilder rev=sb1.reverse();
        System.out.println(" Reverse number is :"+rev);
        
    
    }
    
}
