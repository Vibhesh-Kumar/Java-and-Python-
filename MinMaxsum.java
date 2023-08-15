import java.util.Arrays;

public class MinMaxsum {
    
//public class Main {
    public static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - i - 1];
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(arr);
    }
}


