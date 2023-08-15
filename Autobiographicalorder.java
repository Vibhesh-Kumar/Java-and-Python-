import java.util.*;
// public class Autobiographicalorder {
//     public static int  autobiographicalorder(int[]ar){
//         int count=0;
//         for(int i=0;i<ar.length-1;i++){
//             Arrays.sort(ar);
//             if(ar[i]!=ar[i+1]){
//                 count++;
//             }
        
//         }
//         return count;

//     }
//     public static void main(String[] args) {
//         int[]ar={ 1,2,1,0};
//            // Arrays.sort(ar);
//         System.out.print(autobiographicalorder(ar));
//     }
    
// }
public class Autobiographicalorder {
    public static boolean isAutobiographical(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        int[] digitCount = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (digit >= length || digitCount[digit] != 0) {
                return false;
            }
            digitCount[digit] = i;
        }

        for (int i = 0; i < length; i++) {
            if (digitCount[i] != Character.getNumericValue(numberStr.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 1210;
        if (isAutobiographical(number)) {
            System.out.println(number + " is an autobiographical number.");
        } else {
            System.out.println(number + " is not an autobiographical number.");
        }
    }
}



