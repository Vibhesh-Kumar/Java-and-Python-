class Removechar{
    // public static void main(String[] args) {
    //     String str="CloudteCh";
    //     String s="";
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(ch!='C'){
    //             s=s+ch;

    //         }

    //     }
    //     System.out.println(s);

        
    // }



    // using function 

    public static void main(String[] args) {
        String str="CloudteCh";
        //char cr='C';
        System.err.println(removeChar(str, 'C'));

    }

    public static String  removeChar(String str,char ch){
        String finalstr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!='C'){
                finalstr=finalstr+c;
            }

        }
        return finalstr;
    }
}