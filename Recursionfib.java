public class Recursionfib {
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
            
        }
        System.out.println(a);
        printfib(b,a+b,n-1);
    
}
public static void main(String[] args) {
    printfib(0,1,4);
}
}
