// Time complexity - O(2^n)

public class SubSeq {

    public static void SubSequence(String str, int idx, String newString) {
        
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // to be 
        SubSequence(str, idx+1, newString+currChar);
        
        // not to be
        SubSequence(str, idx+1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        SubSequence(str, 0, "");
    }
}
