import java.util.Scanner;


public class menup {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
       // System.out.println("Enter the no:");
        //n=sc.nextInt();
        int input;
          //  n=sc.nextInt();
        do{
            int mark=sc.nextInt();
            if(mark>= 90 && mark <= 100){
                System.out.println("this is good");
                break;
            }
                else if(mark>= 60 && mark <= 89){
                    System.out.println("this is also good");
                    break;
                }
                else if(mark>= 59 && mark<= 0){
                    System.out.println("this is also good");
                    break;
                }
                    else{
                    System.out.println("Invalid no");
                    break;
                    }
                   // System.out.println("we want to print 1 or 0");
                        
                
            
                       // input=sc.nextInt();
                }
                            while(input==1);
                
        
                
    }
    
}
