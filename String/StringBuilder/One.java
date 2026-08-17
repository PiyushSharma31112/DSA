
public class One {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // char at index 0

        // System.out.println(sb.charAt(0));

        // Set char at index

        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // Insert fun

        // sb.insert(0, 'S');
        sb.insert(2, 'n');

        System.out.println(sb);

        // Delete fun

        sb.delete(2, 3);
        System.out.println(sb);


    }
}