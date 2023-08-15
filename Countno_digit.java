//count no digit in number

public class Countno_digit {
    public static void main(String[] args) {
        int num=1234;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digit in a num is :"+count);

    }
}
