import java.util.Scanner;

public class Solution {
    public static String div(int w) {
        if (w > 2 && w % 2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        System.out.println(div(w));
        sc.close();
    }
}
