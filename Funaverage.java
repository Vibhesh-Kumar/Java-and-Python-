import java.util.Scanner;

public class Funaverage {
        public static void avege(float a,float b,float c) {
            double avg;
            avg=(a+b+c)/3;
            System.out.println(avg);
          //return avg;
             //return a+b+c;
            
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            float a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();


            
            avege(a,b,c);
            
        }
    }

