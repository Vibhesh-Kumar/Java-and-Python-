public class SearchNthOccur {
    public static void main(String[] args) {
        int n=6;
        int []ar={1,4,6,7,6,6,4};
        int count =0;
        int index=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==n){
                count++;

                if(count==3){
                    index=i;
                    break;
            }
        } 
    }
        System.out.print(index);
    }
}

    
    

