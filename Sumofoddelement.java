import java.util.*;
public class Sumofoddelement {

    public static int sumofoddelement(int[] ar){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:ar){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }

        }
        int sum=0;
        for(int c:map.keySet()){
            int frequency=map.get(c);
            if(frequency%2==1){
                sum=sum+c;
            }

            
        }
    return sum;


        
    }
    public static void main(String[] args) {
        int ar[]={1,1,2,2,2,3,4,4,5,5,5,5,6,7,7};
        System.out.println(sumofoddelement(ar));
    }
    
}
