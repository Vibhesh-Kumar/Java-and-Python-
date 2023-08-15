import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        int n;
        int sum=0;
    
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
    
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
            sum=sum+i;
            }
                
            }
            if(n==sum){
                System.out.println("perfect number");
            }
                else {
                    System.out.println("not perfect no");
                }
            }
    }
    

