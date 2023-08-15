public class CountCaryy {

    public static void main(String[] args) {
        int n=1234;
        int n1=5678;
        int carry=0;
        int count=0;
        while(n>0 && n1>0){
            int q=n%10;
            int q1=n1%10;
            int q2=(q+q1+carry)/10;
            carry=q2;
            if(q2==1){  //if( carry>0){count++}
                count++;
            }
            n=n/10;
            n1=n1/10;
            
            //System.out.println(count);

        }
        System.out.println(count);
    }
    
}
