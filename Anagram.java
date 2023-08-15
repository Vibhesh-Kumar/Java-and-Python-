
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1="java";
        String str2="avaj";
        System.out.println("given string is anagram:"+" "+anagram(str1,str2));

    }
    public static boolean anagram(String str1,String str2){
        char []stoch1=str1.toCharArray();
        char []stoch2=str2.toCharArray();
        Arrays.sort(stoch1);
        Arrays.sort(stoch2);
        boolean str=Arrays.equals(stoch1,stoch2);
        return str;
    }
    
}
