import java.util.Scanner;

public class Searcharray {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the element of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }System.out.println("arraya are:");
        for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println("search element  of array are:");
    int n=sc.nextInt();
    for(int i=0;i<5;i++){
        if(arr[i]==n){
            count++;
        }
    
       // System.out.print("sum of element are"+sum);


    }
    if(count>0){
        System.out.println("item found");
    }
    else {
        System.out.println("item not found");
    }
    

}
    }

