import java.util.Scanner;

public class Solution {
    public static String task(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                sb.append(c);
            }
        }
        for (int i = sb.length() - 1; i >= 0; i--) {
            sb.insert(i, '.');
            char lowerChar = Character.toLowerCase(sb.charAt(i + 1));
            sb.setCharAt(i + 1, lowerChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        Solution s1 = new Solution();
        System.out.println(s1.task(word));
    }
}
