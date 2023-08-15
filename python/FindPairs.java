import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<String> pairs = new ArrayList<String>();
        
        for (int i = 0; i < n; i++) {
            int temp = sum - arr[i];
            if (set.contains(temp)) {
                pairs.add(temp + " " + arr[i]);
            }
            set.add(arr[i]);
        }
        
        if (pairs.size() == 0) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Number of pairs found: " + pairs.size());
            for (String pair : pairs) {
                System.out.println(pair.split(" ")[0] + " + " + pair.split(" ")[1] + " = " + sum);
            }
        }
    }
}