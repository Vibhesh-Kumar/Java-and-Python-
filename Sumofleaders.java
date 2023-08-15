public class Sumofleaders {
    public static int sumofleaders(int a[] ){
        int sum=a[a.length-1];
        int max=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                sum=sum+max;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int a[]={43,56,22,77,44,12,32};
        int soflea=sumofleaders(a);
        System.out.println(soflea);
    }
    
}
