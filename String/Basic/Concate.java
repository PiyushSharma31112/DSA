import java.util.*;

public class Concate {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +" " + lastName;

        System.out.print(fullName + " ");
        System.out.println(fullName.length());

        // CharAt

        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }

   }
}
