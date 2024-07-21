package Day4;

public class array {

    static boolean binarySearch(int[] arr, int n) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == n) {
                return true; 
            }else if (arr[mid] < n) {
                i = mid + 1; 
            }else {
                j = mid - 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 19, 12, 13};

        System.out.println(binarySearch(arr, 9));

    }
}
