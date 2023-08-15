import java.util.Scanner;



public class Passwordcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }

    public static boolean isPasswordValid(String password) {
        return password.length() > 6 &&
                containsUppercaseLetter(password) &&
                containsSpecialCharacter(password) &&
                containsNumber(password) &&
                !startsWithNumber(password);
    }

    private static boolean containsUppercaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean startsWithNumber(String password) {
        char firstChar = password.charAt(0);
        return Character.isDigit(firstChar);
    }
}





// boolean num=false;
//         boolean cap=false;
//         String []pass=password.toCharArray();
//         if(password<4){
//             return 0;
//         }
        
//         if(password[0]>=48 || password[0]<58){
//             return 0;
//         }

//         for(int i=0;i<=password.length;i++){
//             if(password==" " || password=="/"){
//                 return 0;
//             }
//             if(password[i]>=48 && password [i]<58){
//                 num =true;
//             }
//             else if(password[i]>=65 && password[i]<=95 ){
//                 cap=true;
//             }

//         }
//         int res=(num && cap);
//         return res;