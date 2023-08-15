import java.util.Scanner;

public class Emailstring {
    public static void main(String[] args) {
    
        // int username=0;
            System.out.println("enter the oroginal string:");
            Scanner sc=new Scanner(System.in);
            String  email=sc.next();
            String username = " ";
            for(int i=0;i<email.length();i++){
                if(email.charAt(i) == '@'){
                    break;
                   // result=result+'i';
                }
                else {

                username=username+email.charAt(i);
                    //result=result+str.length();
                }
            }
            System.out.println(username);
        }
    }

