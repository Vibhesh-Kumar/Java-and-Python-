public class Removewhitespace {
    public static void main(String[] args) {
        String str=" j a v a s t a r";
        String rws=str.replaceAll("\\s","");
        System.out.println(rws);
    }
    
}
