public class RelativeTime {
   // public class Main {

        public static int relativetime(int dir, int d1, int s1, int d2, int s2) {
            int relativeTime;
    
            if (dir == 0) {
                int time1 = d1 / s1;
                int time2 = d2 / s2;
                relativeTime = time1 + time2;
            } else {
                relativeTime = d1 / s1 - d2 / s2;
            }
    
            return relativeTime;
        }
    
        public static void main(String[] args) {
            // Example usage
            int dir = 0;
            int d1 = 30;
            int s1 = 5;
            int d2 = 20;
            int s2 = 10;
    
            int output = relativetime(dir, d1, s1, d2, s2);
            System.out.println("Output: " + output);
        }
    }
    

