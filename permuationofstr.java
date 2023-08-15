public class permuationofstr {
    public static void main(String[] args) {//"abc" {abc,acb,bac,bca,cab,cba}
        String str="abc";                         // output 6
        int count=0;
        int fact=1;

        for(int i=0;i<str.length();i++){
            count++;

        }
        for(int j=1;j<=count;j++){
            fact=fact*j;
        } 
        System.out.println(fact);
    }
    
}
