public class Recurision1 {
//     public static  void recursion(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         recursion(n-1);

//     }
//     public static void main(String[] args) {
//        // int n;
//         recursion(5);
//     }
// }
public static void printno(int n){
    if(n==6){
        return;
    }
    System.out.println(n);
    printno(n+1);

}
public static void main(String[] args) {
    printno(1);
}
}