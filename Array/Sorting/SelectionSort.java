
public class SelectionSort {
    
    public static void selectionSort(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n-1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element 

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        System.out.print("Original Array: ");
        printArr(arr);

        selectionSort(arr);

        System.out.print("Sorted Array: ");
        printArr(arr);

    }
}
