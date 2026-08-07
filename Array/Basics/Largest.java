public class Largest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9};
        int largest = arr[0];

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element is: " + largest);

    }
}
