public class StringRotation {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="CDAB";
        if(isRotation(str1, str2)){
            System.out.println(" String is rotated ");
        }
        else{
            System.out.println(" String is not rotated");
        }

        
    }

    public static Boolean isRotation(String str1,String str2){

        return (str1.length()==str2.length()&& (str1+str1).contains(str2));

        

    }
    
}
