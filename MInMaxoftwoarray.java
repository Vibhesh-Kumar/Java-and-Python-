public class MInMaxoftwoarray {
    public static void main(String[] args) {
        int [] a1={4,3,9,22,6};
        int []a2={8,3,34,9,12};
        int a1c=0;int a2c=0;
        int count=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]>9){
                a1c++;
            }
        }
            for(int j=0;j<a2.length;j++){
                if(a2[j]<9){
                    a2c++;
                }
            }
            count=Math.max(a1c,a2c);
            System.out.print(count);
        }
}
