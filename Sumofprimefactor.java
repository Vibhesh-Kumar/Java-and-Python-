public class Sumofprimefactor {
    public static int  sumofprimefactor(int n){
        int i=2;
        int sum=0;
        int currentfactor=-1;
        while(n>1){
            if(n%i==0){
                if(i!=currentfactor){
                    sum=sum+i;
                currentfactor=i;

                }
                n=n/i;
            }
            else{
                i++;
            }
        }
        return sum; 


    }

    public static void main(String[] args) {
        int n;
        System.out.print(sumofprimefactor(20));
    }
}
