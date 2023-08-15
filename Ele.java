public class Ele {
    public static void main(String[] args) {
        int a=38;  int b=29;
        int rem=a%b;
        System.out.println(rem);

        AmazonELCBLC ama=new AmazonELCBLC();
        ama.input();
        ama.show();
        Flipkart flip=new Flipkart();
        flip.input();
        flip.show();
    }
}
