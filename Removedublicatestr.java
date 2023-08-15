import java.util.HashSet;
import java.util.LinkedHashSet;

// public class Removedublicatestr {

//     public static String removeDublicateStr(String str){
//         HashSet<Character> set=new LinkedHashSet<>();
//         for(int i=0;i<str.length();i++){
//             set.add(str.charAt(i));
//         }

//         StringBuilder sb=new StringBuilder();

//         for(Character c:set){
//             sb.append(c);
//           
//         }
//         //System.out.println(sb);
//         return sb.toString();
//         //System.out.println(set);
//     }

//     public static void main(String[] args) {
//         String str="progrmainng";
//         System.out.print(removeDublicateStr(str));
//     //removeDublicateStr(str);


//     }
    
// }
public class Removedublicatestr {
public static String removeDublicateStr(String str){

    StringBuilder sb2=new StringBuilder();
    char[] ar=str.toCharArray();
for(int i=0;i<ar.length;i++){
    boolean isDublicate=false;

    for(int j=i+1;j<ar.length ;j++){
        if(ar[i]==ar[j]){
            isDublicate=true;
            break;
        }
    }
    if(!isDublicate){
        sb2.append(ar[i]);
    }
}

    return sb2.toString();


}
    public static void main(String[] args) {
        String str="progrmainng";
        System.out.print(removeDublicateStr(str));
}
}