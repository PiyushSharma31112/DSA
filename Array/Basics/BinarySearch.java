public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        int low = 0, mid, high = n - 1;
        
        int key = 34;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j< n - 1 - i; j ++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        while (low<=high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found");
                break;
            }else if (arr[mid] < key) {
                mid = low + 1;
            } else {
                mid = high - 1;
            }

        }

        // If element not found
        if(low > high) {
            System.out.println("Element not found");
        }
    }
}
