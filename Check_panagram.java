public class Check_panagram {
    public static void main(String[] args) {
        String str="hello World";
        System.out.println(isPanagram(str.toLowerCase()));
    }
        public static boolean isPanagram(String str){
            if(str.length()<26){
                return false;
            }
            else{
                for(char ch='a';ch<'z';ch++){
                    if(str.indexOf(ch)<0){
                        return false;
                    }
                }
            }
            
        return true;
            
        }
    }
    

