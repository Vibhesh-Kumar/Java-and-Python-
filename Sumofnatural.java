public class Sumofnatural {
    public static void sumofnatural(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;

        }
        sum+=n;
        sumofnatural(n-1,sum);
    }
    public static void main(String[] args) {
        sumofnatural(5,0);
    }
}
