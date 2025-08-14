import java.util.Scanner;

public class Solution {
    public static String translate(String s, String t) {
        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(t)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        System.out.println(translate(s, t));
    }
}
