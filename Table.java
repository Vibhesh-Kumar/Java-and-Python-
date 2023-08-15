import java.util.Scanner;

public class Table {
    public static void table(int n){
        for(int i=1;i<=10;i++){
           // int r=n*i;
            System.out.println(n+"*"+i+"="+n*i);
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        table(n);
    }
    
}
