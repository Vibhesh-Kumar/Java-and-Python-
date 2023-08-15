import java.util.Scanner;

public class sodd {
    public static void Sumoddno(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
        //int i;
        // if(i%2!=0){
          //11  int sum=0;
        //     for(  i=1;i<=n;i++){
        //         sum=sum+i;
        //        // System.out.println(sum);
                
        //     }
        sum=sum+i;
        //        // System.out.pri
          //  System.out.println(sum);
                
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Sumoddno(n);
    }
    
}

