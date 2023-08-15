import java.util.Scanner;



public  class sumodd {
    public static void Sumoddno(int n){
        for(int i=1;i<=n;i++){
            int sum=0;
            if(i%2!=0){
                sum=sum+i;
                //System.out.println(sum);
                
            }
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Sumoddno(n);
    }
    
}
