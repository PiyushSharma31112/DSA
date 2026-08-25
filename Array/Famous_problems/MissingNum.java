public class MissingNum {
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int n = arr.length;

        int sum = n * (n + 1) / 2;

        for (int num : arr) {
            sum -= num;
        }

        System.out.println(
            "Missing Number = " + sum
        );
    }
}
