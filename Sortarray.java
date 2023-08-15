public class Sortarray {
    // public static boolean isSorted(int arr[],int n){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<arr[i+1]){
    //             return true;
    //         }
    //         else {
    //             return false;

    //         }

        
        //boolean isSorted=true;
    
    public static void main(String[] args) {
        //int n;
        int arr[]={ 3,56,2,7,82};
        boolean isSorted=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                
            }

        }
        if(isSorted){
            System.out.println("array id sorted");
        }
            else{
                System.out.println( "array is not sorted");
            }

        }
    

    }
    

