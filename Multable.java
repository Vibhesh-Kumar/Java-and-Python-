import java.util.Scanner;

class Multable{
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            int result=n*i;
            System.out.println(n+"x"+i+"="+result);
            i++;

        }
        while(i<=10);
    }
}