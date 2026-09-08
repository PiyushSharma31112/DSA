class ValidAnagram {
    
    public static boolean checkAnagram(String str1, String str2) {
        
        if(str1.length() != str2.length()) {
            return false;
        }
    
        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int num : count) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "k";
        String str2 = "nagaram";

        if(checkAnagram(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}