public class Findequalnosubarray {

    // find the equal no of 0 and 1 subarray
    public static void main(String[] args) {
        //int[] ar={0,1,0,1,0};
        int[]ar={0,1,1,1,0,0,0};
        int one=0;int zero=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                zero++;

            }
            else{
                one++;
            }
        }
        if(one==zero){
            System.out.println(one+zero);

        }
        else{
            System.out.println(one+zero-1);

        }

        
    }
}
