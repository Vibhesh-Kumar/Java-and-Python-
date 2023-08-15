import java.util.Scanner;

class Oddeven {
    public static void main(String[] args) {
        int n;
        System.out.println("entr the no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    
}
