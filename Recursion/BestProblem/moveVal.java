public class moveVal {

    public static void moveValAtEnd(String str, int idx, int count, String newString) {
        
        if(idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if(currChar == 'x') {
            count++;
            moveValAtEnd(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveValAtEnd(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
       String str = "axbcxxd";
       moveValAtEnd(str, 0, 0, ""); 
    }
}
