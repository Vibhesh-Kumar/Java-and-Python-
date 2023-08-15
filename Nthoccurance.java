import java.util.Scanner;

class Nthoccurance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        int num=sc.nextInt();
        System.out.println("Enter the occurance:");
        int occurance=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;


            }
            if(count==occurance){
                System.out.println("Index of nth occurance is"+i);
                return;
            }

        }
        System.out.println("Index of nth occurance is -1");

    
    }
}