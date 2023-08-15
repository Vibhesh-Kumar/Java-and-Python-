// public class Stringmatch {


//     public static int stringmatch(String str){
//         int count=0;
//         String[] s=str.split("tim");
//         //char []ch=str.toCharArray();
//        // for(String c:s){
//         //char ss[]=substr.toCharArray();
//         String ar[]={"tim"};
//             for(int i=0;i<s.length;i++){
//             if(s[i].equals(ar[0])){
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         String str="timaveefetimdwedtimde";
//       //  String substr="tim";
//         System.out.println(stringmatch(str));
//     }

    
// }

// public class Stringmatch {
//     public static int stringMatch(String str, String substr) {
//         int count = 0;
//         String[] s = str.split(substr);
//         count = s.length - 1; // Update count based on the split parts
        
//         return count;
//     }

//     public static void main(String[] args) {
//         String str = "timaveefetimdwedtimde";
//         String substr = "tim";
//         System.out.println(stringMatch(str, substr));
//     }
// }



// public class Stringmatch {

//     public static int stringMatch(String str, String substr) {
//         int count = 0;
//         String[] s = str.split(substr);
        
//         for (String c : s) {
//             if (c.equals(substr)) {
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         String str = "timaveefetimdwedtimde";
//         String substr = "tim";
//         System.out.println(stringMatch(str, substr)); // Output: 3
//     }
// }



public class SubstringCount {
    public static void main(String[] args) {
        String str = "timafggtimjgftimvd";
        String substring = "Tim";

        // Convert both the string and substring to lowercase to make it case-insensitive
        int count = countSubstringIgnoreCase(str, substring);

        System.out.println("Number of occurrences of 'Tim' in the string: " + count);
    }

    public static int countSubstringIgnoreCase(String str, String substring) {
        int count = 0;
        String lowercaseStr = str.toLowerCase();
        String lowercaseSubstring = substring.toLowerCase();

        int index = lowercaseStr.indexOf(lowercaseSubstring);
        while (index != -1) {
            count++;
            index = lowercaseStr.indexOf(lowercaseSubstring, index + 1);
        }

        return count;
    }
}


