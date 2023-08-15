import java.util.Scanner;

public class Sumoddeven {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter the no:");//   sum of  odd no
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        // for(int i=1;i<=n;i=i+2){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //sum of even no
        for(int i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println(sum);
            
    }
    
}
