public class LinearSearch {

    void search(int arr[], int n, int key) {

        int found = 0;
        
        for(int i = 0; i<n; i++) {
            if(key == arr[i]) {
                found++;
                break;
            }
        }

        if (found != 0) {
            System.out.println("Element found");
        }else {
            System.out.println("Element not found.");
        }

    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        int key = 22;

        LinearSearch obj = new LinearSearch();
        
        obj.search(arr, n, key);
    }
}

// public class LinearSearch{

//     public static void main(String[] args) {
//         int arr[] = {64, 34, 25, 12, 22, 11, 90};
//         int n = arr.length;
//         int found = 0;
//         int key = 12;

//         for(int i = 0; i < n; i++) {
//             if(key == arr[i]) {
//                 found++;
//                 break;
//             } 
//         }

//         if (found != 0) {
//             System.out.println("Element found");
//         }else {
//             System.out.println("Element not found.");
//         }
//     }
// }