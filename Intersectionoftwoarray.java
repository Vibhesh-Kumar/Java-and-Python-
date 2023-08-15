import java.util.*;
public class Intersectionoftwoarray {
//     public static void main(String[] args) {
        
    
//     int a1[]={80,10,15,2,35,60};
//     int a2[]={35,80,60,20,40};
//     int intsecar[]=new int[3];
//     int index=0;

//     for(int i=0;i<a1.length;i++){
//         for(int j=0;j<a2.length;j++){
//             if(a1[i]==a2[j]){
//                 intsecar[index]=a2[j];
//                 index++;
//             }
//         }
//     }

//     for(int j=0;j<intsecar.length;j++){
//         System.out.print(intsecar[j]+" ");
    
    
// }
//     }

public static void main(String[] args) {
    int a1[]={80,10,15,2,35,60};
    int a2[]={35,80,60,20,40};
   // intersectionoftwoarray(a1, a2);
    union(a1, a2);
    
}


public static void union(int a1[],int a2[]){
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<a1.length;i++){
        set.add(a1[i]);
    }
    for(int i=0;i<a2.length;i++){
        set.add(a2[i]);
    }
    System.out.println(set);
}




// public static void intersectionoftwoarray(int a1[],int a2[]){
//     Set<Integer> set=new HashSet<>();


//     for(int i=0;i<a1.length;i++){
//         set.add(a1[i]);
//     }

//     for(int i=0;i<a2.length;i++){
//         if(set.contains(a2[i])){
//             System.out.println(a2[i]);
//         }
//     }
// }

}
