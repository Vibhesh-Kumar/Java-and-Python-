import java.util.Scanner;

class Twosumo {
    

        public static void main(String[] args) {
          //  System.out.println("enter the size of arrays:");
           // int target; int size;
            int j;
            int sum=0;
            int a[]=new int[5];
            System.out.println("enter the array:");
            Scanner sc=new Scanner(System.in);
    
       // size=sc.nextInt();
        int[] nums=new int[5];
        for(int i=0;i<5;i++){

            nums[i]=sc.nextInt();//input  
        }
        System.out.println("enter the target:");
    int target=sc.nextInt();
        for(int i=0;i<4;i++){
            for(j=i+1;i<4;j++){
            
            
            if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
                
            
        }
    }
        
        }
       // return a;
        }
    
        

    
}
