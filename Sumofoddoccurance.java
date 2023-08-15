// import java.util.*;
// public class Sumofoddoccurance {

//     public static int sumofoddoccurance(int n ){
//       //  String str=String.valueOf(n);
//         String str=Integer.toString(n);
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<str.length();i++){
//             char digit=str.charAt(i);

//             if(map.get(digit)==null){
//                 map.put(digit,1);
            
//             }
//             else{
//                 map.put(digit,map.get(digit)+1);
            
//             }
//         }
        
//         int sum=0;
//         for(char digit:map.keySet()){
//             int occurance=map.get(digit);
//             if(occurance%2==1){
//                 int digitvalue=Character.getNumericValue(digit);
//                 sum=sum+digitvalue;
//             }
//         }

//         return sum;
//     }


    



//         public static void main(String[] args) {
//             int n=1122333;
//             System.out.print(sumofoddoccurance(n));
//         }
// }

import java.util.HashMap;

public class Sumofoddoccurance{
    public static void main(String[] args) {
        int inputNumber = 1122333;
        int sum = getSumOfOddOccurrences(inputNumber);
        System.out.println("Output: " + sum);
    }

    public static int getSumOfOddOccurrences(int number) {
        // Convert the input number to a string
        String numberStr = Integer.toString(number);

        // Create a HashMap to store occurrences of each digit
        HashMap<Character, Integer> occurrencesMap = new HashMap<>();

        // Count occurrences of each digit in the input number
        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);
            occurrencesMap.put(digit, occurrencesMap.getOrDefault(digit, 0) + 1);
        }

        // Calculate the sum of digits with odd occurrences
        int sum = 0;
        for (char digit : occurrencesMap.keySet()) {
            int occurrence = occurrencesMap.get(digit);
            if (occurrence % 2 != 0) {
                int digitValue = Character.getNumericValue(digit);
                sum += digitValue*occurrence;
            }
        }

        return sum;
    }
}
