public class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                temp.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String new_s = temp.toString();
        String rev_s = new StringBuilder(new_s).reverse().toString();

        return new_s.equals(rev_s);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println("\"" + test1 + "\" is palindrome? " + sol.isPalindrome(test1));

        String test2 = "race a car";
        System.out.println("\"" + test2 + "\" is palindrome? " + sol.isPalindrome(test2));
    }
}
