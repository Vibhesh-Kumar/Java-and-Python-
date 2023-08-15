import java.util.Arrays;
public class Sort_stringalpha {
    public static void main(String[] args) {
        String str="vibhesh";
        char temp;

        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
// method 2
        String str1="vibheshkumar";
        char[]chararr=str.toCharArray();
        Arrays.sort(chararr);

        System.out.println(new String(chararr));
        
    }
    

    
}
