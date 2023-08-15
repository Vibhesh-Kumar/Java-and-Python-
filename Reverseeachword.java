public class Reverseeachword {
    public static void main(String[] args) {
        String input="java code";
        String output="";
        String[] words=input.split(" ");
        for(String word:words){ 
            String revword="";
            for(int i=word.length()-1;i>=0;i--){
                revword=revword+word.charAt(i);
            }
            output=output+revword+"";
        }
    }
    
}
