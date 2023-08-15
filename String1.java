import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
            int lenofstring=0;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String arr[]=new String[size];
        System.out.println("enter the element of string:");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
            lenofstring+=arr[i].length();
        }

        
        // for(int i=0;i<size;i++){
        //     lenofstring+=arr[i].length();
        // }
        System.out.println("length of string are:"+lenofstring);
    }
    
}
