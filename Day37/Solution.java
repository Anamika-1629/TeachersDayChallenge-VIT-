import java.util.Scanner;

public class Solution {
    public static String HQ9plus(String p) {
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (ch == 'H' || ch == 'Q' || ch == '9') {  
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        System.out.println(HQ9plus(p));
        sc.close();
    }
}
