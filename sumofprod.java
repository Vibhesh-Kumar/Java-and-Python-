class sumofprod{
    public static int Sumofproduct(int a1[],int []a2){
        int sum=0;
        for(int i=0;i<a1.length;i++){
            for(int j=a2.length-1;j>0;j--)
            sum=sum+a1[i]*a2[j];
           // return sum;

        }
        return sum;

    }

    public static void main(String[] args) {
        int []a1={22,7,1,5,-5,2};
        int []a2={4,-1,21,12,10,3};
        System.out.print(Sumofproduct(a1, a2));
    }
}