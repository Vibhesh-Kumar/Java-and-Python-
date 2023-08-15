import java.util.Scanner;

public class oddn {
    //print all odd no of 1 to N
    public static void main(String[] args) {
        int n;
        System.out.println("entr the no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        // method 1
        // for(int i=1;i<=n;i++){
        //     // if(i%2!=0){
        //     //     System.out.print(i+" ");
        //     // }
       // }
            //method 2
            // for(int i=1;i<=n;i=i+2){
            //     System.out.println(i);
            // }
                
            //print even no from 1 to N
            // for(int i=0;i<=n;i=i+2){   //method 1
            //     System.out.println(i);
            // }
            for(int i=0;i<=n;i++){
                    if(i%2==0){
                        System.out.print(i+" ");
                    }
            }
}
}
