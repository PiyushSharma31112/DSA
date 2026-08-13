public class SortedArray {

    public static boolean isSort(int[] arr, int idx) {

        if(idx == arr.length-1) {
            return true;
        }

        // if(arr[idx] >= arr[idx + 1]) - // UnSorted Array

        if(arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return isSort(arr, idx+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
        System.out.println(isSort(arr, 0));
    }
}