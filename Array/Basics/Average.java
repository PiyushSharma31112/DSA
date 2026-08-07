public class Average {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 67, 7, 8};
        float sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]);
        }

        float avg = sum / arr.length;

        System.out.println("Avg is: "+ avg);
    }
}
