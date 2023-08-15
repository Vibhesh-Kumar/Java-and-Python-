public class Selectionsort {
    public static void main(String[] args) {
        int arr[]={3,5,2,7,8};
        for(int i=0;i<arr.length-1;i++){ //selecton sort
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            
            }
            int temp=arr[smallest];// swaping
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        selectionsort(arr);

    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
}
