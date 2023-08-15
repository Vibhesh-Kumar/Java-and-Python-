

public class Findpairsum {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=50;
        for(int i=0;i<arr.length;i++){
            for(int j=i+i;j<arr.length;j++){

                //method-1
                // if(arr[j]==sum-arr[i]){
                //     System.out.println(arr[i]+" "+arr[j]);

                //method-2
                if(sum==arr[i]+arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
    
                }
                }
            }
        }
    }
    

