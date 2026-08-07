public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        
        int n = arr.length;

        for(int i = 1; i < n - 1; i++) {
            int key = arr[i];

            int j = i - 1;

            // Shift element greater than key to one position ahead
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {55, 22, 43, 11, 99};

        System.out.print("Original Array: ");
        printArr(arr);

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        printArr(arr);

    }
}
