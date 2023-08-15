import java.util.Scanner;

public class Insertelement {
    public static void main(String[] args) {
        int size,i,loc,item;
       // int loc;
        System.out.println("enter the size:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size+1];
        for( i=0;i<size;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("enter the loc:");
        loc=sc.nextInt();
        System.out.println("enter the item:");
        item=sc.nextInt();
        for(i=size;i>loc;i--){

            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for(i=0;i<size;i++){
            System.out.println("new array are:"+a[i]);


    }
    
    }
}
