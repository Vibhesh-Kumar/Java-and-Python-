public class Rightrotation {
    public class RightRotationChecker {
        public static boolean isRightRotation(String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false; // Different lengths, cannot be right rotation
            }
            
            String concatenated = word2 + word2;
            
            return concatenated.contains(word1);
        }
        
        public static void main(String[] args) {
            String word1 = "string";
            String word2 = "ngstri";
            
            if (isRightRotation(word1, word2)) {
                System.out.println(word1 + " is a right rotation of " + word2);
            } else {
                System.out.println(word1 + " is not a right rotation of " + word2);
            }
        }
    }
    
    
}
