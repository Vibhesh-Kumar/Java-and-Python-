
 // pairs sum of sorted array 
public class Paris_sum {
    public static void main(String[] args) {
        int sum=9;
        int arr[]={1,2,3,4,5,6,7,8};
        int low=arr[0];
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]>sum){
                high--;
            }
            else if(arr[low]+arr[high]<sum){
                low++;
            }
            else if(arr[low]+arr[high]==sum){
                System.out.println("sum of array is :"+arr[low]+" "+arr[high]);
                high--;
                low++;
            }
        }

    }
    
}
