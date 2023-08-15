import java.util.List;

public class Appleoranghackerrank {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
    int apc=0;
    for(int applesno:apples){
        if(a+applesno>=s && a+applesno<=t){
            apc++;
        }
    
    }
    
    
    int orc=0;
    for(int orangesno:oranges){
        if(b+orangesno>=s && b+orangesno<=t){
            orc++;
        }
        
    }
    System.out.print(apc+"\n"+orc);
    

    }

}
