import java.util.Scanner;

public class countno{
    public static void main(String[] args){
        int positive=0,negative=0,zeroes=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int input=sc.nextInt();
        while(input==1){
            System.out.println("enter the no");
            int number=sc.nextInt();
            if(number>0){
                positive++;
              //stem.out.println("positive no"+positive);
        
            }
           // System.out.println("positive no"+positive);
        
            
            else if(number<0){
                negative++;
                
                //System.out.println(" negative no"+negative);
            }
            else {
            
                zeroes++;
               // System.out.println("no are zero"+zeroes);
            }
        
        }
        System.out.println("enter the no");
        input=sc.nextInt();
        System.out.println("positive no"+positive);
        System.out.println(" negative no"+negative);
        System.out.println("no are zero"+zeroes);



    }


    }
    
