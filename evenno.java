import java.util.Scanner;

public class evenno {
    public static void main(String args[]){
        int i,n;
        System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); 
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
    
}
