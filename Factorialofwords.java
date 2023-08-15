public class Factorialofwords {


    public static void factorial(int n,int r){
        int factn=1;
        int factr=1;
        for(int i=n;i>0;i--){
           // fact=fact*i/(n-r)*i;
        factn=factn*i;
        
        }

        for(int i=r;i>0;i--){
            factr=factr*i;
        }

    int word=(factn)/(factr);
    System.out.print(word); 
        
    }




//     import java.math.BigInteger;

// public class WordPermutations {
//     public static BigInteger factorial(int n) {
//         BigInteger fact = BigInteger.ONE;
//         for (int i = 1; i <= n; i++) {
//             fact = fact.multiply(BigInteger.valueOf(i));
//         }
//         return fact;
//     }

//     public static BigInteger calculatePermutations(int n, int r) {
//         BigInteger numerator = factorial(n);
//         BigInteger denominator = factorial(n - r);
//         return numerator.divide(denominator);
//     }

//     public static void main(String[] args) {
//         String word = "QUESTION";
//         int totalLetters = word.length();
//         int chosenLetters = 4;

//         BigInteger permutations = calculatePermutations(totalLetters, chosenLetters);
//         System.out.println("Number of different four-letter words: " + permutations);
//     }
// }

    
    public static void main(String[] args) {
        int n;
    int r;
    factorial(8,4);
    }
    
    
}
