public class RevString {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        System.out.println("Normal String: " + str);
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("After Reverse: " + rev);
    }
}
