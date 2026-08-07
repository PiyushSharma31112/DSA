package Array.Sorting;
public class BubbleSort {
    
    void bubble(int arr[], int n){
        
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }   
    }

    void printArray(int arr[], int n) {

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = {2, 44, 6, 1, 5, 90, 32};
        int n = arr.length;

        BubbleSort obj = new BubbleSort();

        System.out.println("Original array: ");

        obj.printArray(arr, n);
        
        obj.bubble(arr, n);

        System.out.println("\nSorted Array: ");
        obj.printArray(arr, n);
    
    }
}
