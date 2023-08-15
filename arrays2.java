import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String names[]= new String [size];
        //input
        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();

        }
        //outpu{}
        for(int i=0;i<names.length;i++){
            System.out.println("names is "+(i+1)+"is :"+names[i]);
        }


    }
    
}
