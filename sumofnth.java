import java.util.Scanner;

public class
                                                                                                                                                                                                                         sumofnth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int m=sc.nextInt();
        System.out.println("Enter the second number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
