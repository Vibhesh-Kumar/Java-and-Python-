import java.util.LinkedList;

public class LLP1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("vibhesh");
        list.add("kumar");
        list.add("singh");
        list.addLast("from");
        list.addFirst("my");
        list.add(1,"is");
        list.remove(2);
   // list.clear();
        System.out.println(list);
    }
    
} 
