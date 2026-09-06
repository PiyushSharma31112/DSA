import java.util.Arrays;

class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // If all digits are 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        // Input
        int[] digits = {1, 2, 9};

        // Create object
        PlusOne obj = new PlusOne();

        // Call method
        int[] result = obj.plusOne(digits);

        // Print output
        System.out.println(Arrays.toString(result));
    }
}