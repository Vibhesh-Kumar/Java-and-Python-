import java.util.Scanner;




public class tableofn {
    
    public static void main(String[] args) {
        int r, n;
    System.out.println("enter the no:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=10;i++){
        r=n*i;
        System.out.println(n+"*"+i+"="+r);
    }
    }
}
