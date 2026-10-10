class RevWord {
    public static String reverseWords(String s) {

        String[] words = s.split("\\s+");
        String result = "";

        for (String word : words) {

            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            System.out.print(rev +" "+ rev.length() + " ");

            result += rev + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String str = "I like this very much";
        
        reverseWords(str);
    }
}