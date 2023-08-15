  //to check palindrome string
public class Palindromestring {
    public static void main(String[] args) {
        String str="vibhesh";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
          ///  System.out.println("Reverse the number are:"+rev);
        }
        System.out.println("Reverse the number are:"+rev);

        if(str.equals(rev)){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrme number");
        }

    }
    
}
