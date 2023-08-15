import java.util.HashSet;
import java.util.Iterator;
public class HasSet {
    public static void main(String[] args) {
        //Hashset does not follow order
        HashSet<String> set=new HashSet<>();
        //add
        set.add("Vibhesh");
        set.add("Kumar");
        set.add("Singh");
        System.out.println(set);
        //size
       // set.size();
            System.out.println("size of the set is :"+set.size());
            //search
            System.out.println("element of set is :"+set.contains("Singh"));
            //delete
           // set.remove("Singh");
       // System.out.println("Deleted element are:"+set.remove("Singh"));
        //Iteration has not follow order
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println(set.isEmpty());
    }
    }

