public class Andorandexoroperation {
    public static char AND(char a,char b){
        if(a=='1' & b=='1'){
            return '1';
        }
        else{
        return '0';
        }
    }
        public static char OR(char a,char b){
        if(a=='0' | b=='0'){
            return '0';}
            else{
        return '1';
        }
    }
        public static char XOR(char a,char b){
        if(a==b){
            return '0';
        }
        else{
        return '1';
        }
    }

    public static int  binaryoperation(String str){
        if(str.length()==0){
            return 0;
        }
        char s[]=str.toCharArray();
        char res1=s[0];
       // int i=1;
    
        for(int i=1;i<s.length-1;i++){
            char op=s[i];
            char res2=s[i+1];

            if(op=='A'){
                res1=AND(res1,res2);
            }
            if(op=='B'){
                res1=OR(res1,res2);
            }
            if(op=='C'){
                res1=XOR(res1,res2);
            }

        }

        return res1=='1'? 1:0;
    }

    public static void main(String[] args) {
        String str="1C0C1C1A1B1";
        System.out.print(binaryoperation(str));
    }
    
}
