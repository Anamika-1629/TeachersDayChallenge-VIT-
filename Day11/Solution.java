import java.util.Scanner;

public class Solution {
    public static String task(String word) {
        String vowels = "aoyeui"; 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (vowels.indexOf(c) == -1) { 
                sb.append('.').append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        System.out.println(task(word));
    }
}
