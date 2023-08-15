import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        System.out.println("enter the oroginal string:");
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result=result+'i';
            }
            else {
                result=result+str.charAt(i);
                //result=result+str.length();
            }
        }
        System.out.println(result);
    }
    
}
