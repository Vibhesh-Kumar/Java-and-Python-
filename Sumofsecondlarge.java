import java.util.Arrays;
import java.util.ArrayList;
public class Sumofsecondlarge {   //accenture sum of even and odd place 
    public static void main(String[] args) {
       // ArrayList<Integer>list= new ArrayList<>();
        
        int ar[]={3,4,1,7,9};
        int evenar[]=new int[3];
        int oddar[]=new int[2];
        int sum=0;
        int evenidx=0;
        int oddidx=0;
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
            evenar[evenidx]=ar[i];
               // evenidx++;
            }
            else{
                oddar[oddidx]=ar[i]; 
                //oddidx++;

            }
        }
            Arrays.sort(evenar);
            Arrays.sort(oddar);
            System.out.println(evenar);

            sum=evenar[1]+oddar[1];// Sum of the second largest even and odd numbers

            System.out.print("sum of second largest no is:"+sum);
            
        }
    }
    

