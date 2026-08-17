// Reverse String using StringBuilder

public class Reverse {
   
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); 

        for(int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i; //5-1-0

            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fronChar);
        }

        System.out.println(sb);
    }
}
