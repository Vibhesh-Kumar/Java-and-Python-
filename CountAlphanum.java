public class CountAlphanum {

    public static int countAlphanum(String  str){
        String s=str.replaceAll("[^0-9a-zA-Z]","");
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str="aG&k0#1p%";
        System.out.println(countAlphanum(str));
    



    }
    
}
