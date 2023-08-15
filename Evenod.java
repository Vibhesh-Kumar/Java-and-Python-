import java.util.Scanner;

class Evenod {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even no");
        }
        else {
            System.out.println("odd no");
        }

        

    }
}
