import java.util.Arrays;
public class SortEvenandOddarr {

    public static void main(String[] args) {
        int []a1={1,2,5,4,7,8,11,20};
        System.out.print(sortEvenandOddarr(a1));

    }

    public static void sortEvenandOddarr(int a1[]){
        int newar[]=new int[a1.length];
    
        int index=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]%2==0){
                newar[index]=a1[i];
                index++;
            }     
    }
    for(int i=0;i<a1.length;i++){
            if(a1[i]%2!=0){
                newar[index]=a1[i];
                index++;
            }     
    }
        // for(int i=0;i<newar.length;i++){
        //     System.out.print(newar[i]+" ");
        // }


    

}
    
}
