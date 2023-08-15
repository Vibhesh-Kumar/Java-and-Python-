
import java.util.*;
public class CombineHashMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] keys1 = scanner.nextLine().split(" ");
        int[] values1 = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
        String[] keys2 = scanner.nextLine().split(" ");
        int[] values2 = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
        Map<String, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < keys1.length; i++) {
            hashmap.put(keys1[i], values1[i]);
        }
        for (int i = 0; i < keys2.length; i++) {
            if (hashmap.containsKey(keys2[i])) {
                hashmap.put(keys2[i], values2[i]);
            } else {
                hashmap.put(keys2[i], values2[i]);
            }
        }
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashmap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}


