public class Recursionpow {
public static int power(int x,int n){
    if(n==0){
        return 1;

    }
    if(x==0){
        return 0;
    }
        int xx=power(x,n-1);
        int xn=x*xx;
        return xn;

}
public static void main(String[] args) {
    int n=2;int x=4;
int pow= power(x,n);
    System.out.println(pow);
}

}
