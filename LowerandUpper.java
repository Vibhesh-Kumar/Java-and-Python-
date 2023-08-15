import java.util.Scanner;

public class LowerandUpper {
    public static void main(String[] args) {
        char ch,ch1;
        System.out.println("enter the character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch>='A' && ch <='Z'){
            ch1=Character.toLowerCase(ch);
            System.out.println("lowercase"+" "+ch1);

        }
        else {
            ch1=Character.toUpperCase(ch);
            System.out.println( "uppercase"+" "+ch1);


        }



    }
    
}
