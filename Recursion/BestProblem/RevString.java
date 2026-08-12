public class RevString {

    public static void revStr(String s, int idx) {

        if(idx == 0) {
            System.out.println(s.charAt(idx));
            return;
        }

        System.out.println(s.charAt(idx));
        revStr(s, idx-1);
    }

    public static void main(String args[]) {
        String s = "abcd";

        revStr(s, s.length()-1);
    }    
}
