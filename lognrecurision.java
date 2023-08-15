public class lognrecurision {
    public static int poweroflogn(int x,int n){
        if(n==0){
            return 1;
    
        
        }
        if(n%2==0){
            return poweroflogn(x,n/2)* poweroflogn(x,n/2);
        }
        else{
            return x* poweroflogn(x,n/2)*poweroflogn(x,n/2);
        }
            // int xx=power(x,n-1);
            // int xn=x*xx;
            // return xn;
    }
    public static void main(String[] args) {
        int n=2;int x=4;
    int pow= poweroflogn(x,n);
        System.out.println(pow);
    }
}
