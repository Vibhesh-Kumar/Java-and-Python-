import java.util.Scanner;

public class Deletearray {
public static void main(String[] args) {
    int i,loc,size;
    System.out.println("enter the size");
    Scanner sc=new Scanner(System.in);
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter the array :");
    for(i=0;i<size;i++){
        a[i]=sc.nextInt();

    }
    System.out.println("enter the  loc:");
    loc=sc.nextInt();
    for(i=loc;i<size-1;i++){
        a[i]=a[i+1];
    }
    size--;
    for( i=0;i<size;i++){
        System.out.print(a[i]+" ");
    }

}
    
}
