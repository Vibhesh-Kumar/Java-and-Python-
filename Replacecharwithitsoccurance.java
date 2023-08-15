import java.util.Arrays;
public class Replacecharwithitsoccurance {
    public static void main(String[] args) {
        String str="opentext";
        //char arr[]=str.toCharArray();
        char chartoreplace='t';
        if(str.indexOf(chartoreplace)==-1){
            System.out.println("Given character is not present in the string:");
                System.exit(0);
        }
        // char arr[]=str.toCharArray();
        // int count=1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==chartoreplace){
        //         arr[i]=String.valueOf(count).charAt(0);
        //         count++;
        //     }

        // }
        // System.out.println(Arrays.toString(arr));

        int count=1;
    
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==chartoreplace){
                str=str.replaceFirst(String.valueOf(chartoreplace),String.valueOf(count));
                count++;

            }
        }
        System.out.println(str);


    }
    
}
