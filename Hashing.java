import java.util.*;

import javax.xml.transform.stream.StreamSource;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Bihar",1);
        map.put("UP",2);
        map.put("delhi",3);
        System.out.println("Element are:"+map.get("delhi"));
        System.out.println(map.containsKey("Bihar"));
        //map.remove();
        System.out.println(map.remove("delhi"));
        //Interation 1
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            // Iteration 2
            Set<String> keys=map.keySet();
            for(String key:keys){
                System.out.println(key+" "+map.get(key));
            }

        }
    }
}
