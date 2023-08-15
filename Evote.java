import java.util.Scanner;

public class Evote {
    
    public static boolean evote(int age){
        if(age>=18){
           // System.out.println("eligible for vote");
            return true ;
        }
        else {
           // System.out.println(" not eligible for vote");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
        //evote(age);
                System.out.print(evote(age));
    }

}
