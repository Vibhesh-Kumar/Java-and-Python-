import java.util.*;

public class Occuranceofchara {
           //approach 1
    // public static int occuranceofchar(String str,char ch){
    //     int a=0;
    //     //char ch='a';
        


    //     for(int i=0;i<str.length()-1;i++){
    //         char cha=str.charAt(i);
    //         //for(int j=1;j<=str.length()-1;j++){
    //             if(cha==ch ){
    //                 a++;






    
    //                 // b++;
    //                 // c++;
    //                 // d++;
    //                 // e++;

    //             }
            
    //     }
    //     return a;

      //approach 2
    // public class CharacterOccurrenceFinder {
    //     public static void main(String[] args) {
    //         String input = "abcaca";
    //         char targetCharacter = 'a';
    //         int occurrences = countCharacterOccurrences(input, targetCharacter);
    //         System.out.println(targetCharacter + "=" + occurrences);
    //     }
    
    //     public static int countCharacterOccurrences(String input, char targetCharacter) {
    //         int occurrences = 0;
    
    //         for (char c : input.toCharArray()) {
    //             if (c == targetCharacter) {
    //                 occurrences++;
    //             }
    //         }
    
    //         return occurrences;
    //     }
    // }
    



    public static void occuranceofchara(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char []ch=str.toCharArray();
        for(char k:ch){
        // if(map.get(k)==null){ // method 1
        //     map.put(k,1);
        // }
        // else{
        //     map.put(k,map.get(k)+1);
        // }


        if(map.containsKey(k)){   // mehthod 2 
            map.put(k,map.get(k)+1);
            
        }

        else{ 
            map.put(k,1);
        }
    }
    for(Map.Entry<Character,Integer> e:map.entrySet()){
        System.out.println(e.getKey()+ " "+ e.getValue());
        
    }

    }



//     import java.util.HashMap;
// import java.util.Map;

// public class CharacterOccurrenceCounter {
//     public static void main(String[] args) {
//         String input = "abcac";
//         Map<Character, Integer> characterOccurrences = countCharacterOccurrences(input);
//         displayCharacterOccurrences(characterOccurrences);
//     }

//     public static Map<Character, Integer> countCharacterOccurrences(String input) {
//         Map<Character, Integer> characterOccurrences = new HashMap<>();

//         for (char c : input.toCharArray()) {
//             characterOccurrences.put(c, characterOccurrences.getOrDefault(c, 0) + 1);
//         }

//         return characterOccurrences;
//     }

//     public static void displayCharacterOccurrences(Map<Character, Integer> characterOccurrences) {
//         for (Map.Entry<Character, Integer> entry : characterOccurrences.entrySet()) {
//             char character = entry.getKey();
//             int occurrence = entry.getValue();
//             System.out.println(character + "=" + occurrence);
//         }
//     }
// }


    public static void main(String[] args) {
        String str="abaacde";
          //  char ch='a';
        occuranceofchara(str);
    
    }
    
}
