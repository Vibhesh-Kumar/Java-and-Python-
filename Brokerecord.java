import java.util.ArrayList;
import java.util.List;

public class Brokerecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int firstmax=scores.get(0);
    int firstmin=scores.get(0);
    int maxcount=0;
    int mincount=0;
    for(int i:scores){
        if(i>firstmax){
            maxcount++;
            firstmax=i;
            
        }
        if(i<firstmin){
            mincount++;
            firstmin=i;
        }
        

    }
    ArrayList<Integer> brokeRecords = new ArrayList<>();
        brokeRecords.add(maxcount);
        brokeRecords.add(mincount);
    return brokeRecords;


//secong approach
// public static int[] breakingRecords(int[] scores) {
//     int[] recordCounts = {0, 0}; // Initialize the counts for breaking records
//     int minScore = scores[0]; // Initialize the minimum score with the first game's score
//     int maxScore = scores[0]; // Initialize the maximum score with the first game's score

//     for (int i = 1; i < scores.length; i++) {
//         if (scores[i] > maxScore) {
//             maxScore = scores[i];
//             recordCounts[0]++; // Increment the count for breaking the most points record
//         } else if (scores[i] < minScore) {
//             minScore = scores[i];
//             recordCounts[1]++; // Increment the count for breaking the least points record
//         }
//     }

//     return recordCounts;
// }


// public static void main(String[] args) {
//     int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
//     int[] recordCounts = breakingRecords(scores);
//     System.out.println("Number of times Maria broke the most points record: " + recordCounts[0]);
//     System.out.println("Number of times Maria broke the least points record: " + recordCounts[1]);
// }


    

    }

}
