public class Timeconversion {
    static String timeConversion(String s) {
        // Separate the hour, minute, second, and AM/PM indicator
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        String ampm = s.substring(8, 10);

        // Convert to 24-hour format
        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0; // 12 AM is 00:00:00 in 24-hour format
            }
        } else {
            if (hour != 12) {
                hour += 12; // Add 12 to convert PM hours (except 12 PM)
            }
        }

        // Format the time in 24-hour format
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        String inputTime = "07:05:45PM";
        String convertedTime = timeConversion(inputTime);
        System.out.println(convertedTime); // Output: 19:05:45
    }
    
}
