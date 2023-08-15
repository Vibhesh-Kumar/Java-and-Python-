
    import java.util.*;

public class Betweentwoset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        
        int totalX = getTotalX(a, b);
        System.out.println(totalX);
    }
    
    public static int getTotalX(int[] a, int[] b) {
        int count = 0;
        
        for (int i = 1; i <= 100; i++) {
            boolean isFactor = true;
            
            for (int num : a) {
                if (i % num != 0) {
                    isFactor = false;
                    break;
                }
            }
            
            if (isFactor) {
                for (int num : b) {
                    if (num % i != 0) {
                        isFactor = false;
                        break;
                    }
                }
            }
            
            if (isFactor) {
                count++;
            }
        }
        
        return count;
    }
}


