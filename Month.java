import java.util.Scanner;

public class Month {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month:");
        n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("january:31");
            break;
            case 2:
            System.out.println("feb:28 or 29");
            break;
            case 3:
            System.out.println("mar:31");
            break;
            case 4:
            System.out.println("april:30");
            break;
            case 5:
            System.out.println("may:31");
            break;
            case 6:
            System.out.println("june:30");
            case 7:
            System.out.println("july:31");
            break;
            case 8:
            System.out.println("aug:31");
            break;
            case 9:
            System.out.println("sep:30");
            break;
            case 10:
            System.out.println("oct:31");
            break;
            case 11:
            System.out.println("nov:30");
            break;
            default:
            System.out.println("dec:31");
            
        }
    }
    
}
