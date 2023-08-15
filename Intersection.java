import java.util.HashSet;
public class Intersection{
public static int intersection(int arr1[],int arr2[]){
    HashSet <Integer> set=new HashSet<>();
    int count=0;

    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int j=0;j<arr2.length;j++){
        set.contains(arr2[j]);
        count++;
        set.remove(arr2[j]);
    }
    return count;


}
public static void main(String[] args) {
    int arr1[]={3,9,6};
    int arr2[]={6,3,9,2,9,4};
    System.out.println(intersection(arr1, 0));
}
}


