public class Removespeialchar {
    public static void main(String[] args) {
        String str="#vi$b!he&sh";
        String plainstr=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainstr);
    }
    
}
