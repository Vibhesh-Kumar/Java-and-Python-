package java;

public class Coutnvowelconstanat {



    public static void countvowel(String str){
        int countvol=0;
        int countconst=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                ++countvol;

            }
            else {
                ++countconst;
            }
        }
    }

    public static boolean isVowel(char ch){
        ch=Character.toUpperCase(ch);
        return ( ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U');

    }
    

}
