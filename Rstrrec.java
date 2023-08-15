public class Rstrrec {
    public static String reversestr(String stri){
        if(stri.length()==1){
            return stri;

        }
        char curchar=stri.charAt(0);
        String nextstring=reversestr(stri.substring(1));
        return nextstring+curchar;
    
    }
    public static void main(String[] args) {
        String str="vibhesh";

       // reversestr(str);
        System.out.println(reversestr(str));
    }
    
}
