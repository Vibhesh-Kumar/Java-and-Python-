import java.util.Scanner;

public class greatestno {
    public static void greatest(int a,int b){ //if return is int then return must use int 
        if(a>b){
            System.out.println(a);
           // return a;
        }
        else {
            System.out.println(b);
          //  return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        int a=sc.nextInt();
        int b=sc.nextInt();
        greatest(a,b);
       // System.out.println(greatest(a,b));// greatest(a,b);
}
}
