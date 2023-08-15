import java.util.Scanner;

public class oddno {
    public static void sodd(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){ //if i=0 print enen no
           // if(i%2!=0){
                //sum=sum+i;
                System.out.println(i);
            }
        
        //System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sodd(n);
    }
}
