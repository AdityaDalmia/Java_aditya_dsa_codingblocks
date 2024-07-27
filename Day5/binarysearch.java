package Day5;

public class binarysearch {
    /*static int binarySearch(int arr[], int sum){
        int low = 0, high = arr.length - 1;
        int mid=0;
        while (low <= high) {
            mid=(low+high)/2;
            if (arr[mid] == sum)
            return mid;
            else if (arr[mid] < sum){
            low = mid + 1;
             } else
            high = mid - 1;
            }
           }return -1;*/


    public static void bubblesort(int[] arr) {
        for(int turn= 1;turn<arr.length;turn++){
            for(int i=0; i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        
    }

        static void display(int[] arr){
            for(int i:arr)System.out.print(i+" ");
            System.out.println();
        }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,3,1,9,6};
        bubblesort(arr);
        display(arr);
    
}
}
