

public class Firstcharofstr {
    public static void firstchar(String str){
            String words[]=str.split("");
            for(int i=0;i<words.length;i++){
                String s=words[i];
                System.out.println(s.charAt(i));
            }
    }

    public static void main(String args[]){
        String str="wel come to java";
        firstchar(str);
    }



    
}
