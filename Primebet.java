import java.util.Scanner;

public class Primebet {
    public static void main(String[] args) {
        int n,n1;
    int j,i;
        Scanner s=new Scanner(System.in);
    
        System.out.println("enter the no");
        n=s.nextInt();
    n1=s.nextInt();
    for( i=n;i<=n1;i++)   {
        for(  j=2;j<=i;j++)
        {
            if(i%j==0){
            break;
        }
    }
        if(i==j){
            
                System.out.println(j);

        }
    }
}
}
