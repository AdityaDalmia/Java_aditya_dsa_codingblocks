package Day6;

public class selectionsort {
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx= minimumValue(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }

    static int minimumValue(int[] arr, int a){
        int mini= a;
        for(int i=a+1; i<arr.length;i++)
            if(arr[mini]>arr[i])
             mini=i;
             return mini;
    }
        static void display(int[] arr){
            for(int i:arr)System.out.print(i++);
            System.out.print(arr[i]+" ");
        System.out.println();

        }

    public static void main(String[] args){
        int [] arr={1,2,3,3,4,5,6,7};
        display(arr);
        SelectionSort(arr);
    }
}