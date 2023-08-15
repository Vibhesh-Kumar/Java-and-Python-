import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class pattern10 {
    public static void main(String args[]){
        int n;
       // int number=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        n=sc.nextInt();
       // System.out.println("enter the column");
      //  m=sc.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){  
                if((i+j)%2 == 0) {
                    System.out.println(1+" ");
                }  
                else {
                System.out.println(0+" "); 
        

            }
            System.out.println();
        }
    
    }
    
    }
}






