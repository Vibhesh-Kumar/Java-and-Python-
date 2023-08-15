import java.util.List;
public class Averybigsum {
    public static long  averybigsum(List<Long> ar){
        long sum=0;
        for(long i:ar){
            sum=sum+i;

        }
        return sum;


    }


    public static void main(String[] args) {
       // List<Long> ar=new List<>();
        long ar[]={10000001,10000002,10000003,10000004,10000005};
        System.out.println(averybigsum(ar));
    }
    
}
