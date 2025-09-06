import java.util.Scanner;

public class Solution {

    public static String caps(String s) {
        if (isAllUpperCase(s)) {
            return s.toLowerCase();
        } else if (s.length() > 1 && Character.isLowerCase(s.charAt(0)) && isAllUpperCase(s.substring(1))) {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        } else {
            return s;
        }
    }

    public static boolean isAllUpperCase(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isUpperCase(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(caps(s));
        sc.close();
    }
}
