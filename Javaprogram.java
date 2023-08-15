import java.util.Scanner;

// import java.util.Scanner;

// class Javaprogram{
//     public static void main(String[] args) {
//         int n,n1;
//         int i,j;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first no:");
//         n=sc.nextInt();
//         System.out.println("Entert the second no:");
//         n1=sc.nextInt();
//         for( i=n;i<=n1;i++){
//             for( j=2;j<=i;j++){
//                 if(i%j==0){
//                     break;
                    
//                 }

//             }
//             if(i==j){
//                 System.out.print(j+" ");
//             }
//         }
//         // if(i==j){
//         //     System.out.println(j);
//         // }

//     }
// }


class Javaprogram{
        public static void main(String[] args) {
            int n;
            int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;

                }
            }
            if(count==2){
                System.out.println("Prime no");
            }
            else {
                System.out.println("not prime no");
            }

    }
}