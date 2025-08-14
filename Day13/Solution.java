import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String processString(String s) {
        StringBuilder sb = new StringBuilder();

        // Extract only digits from the input
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        // Sort the digits
        char[] temp = sb.toString().toCharArray();
        Arrays.sort(temp);

        // Insert '+' between digits
        StringBuilder res = new StringBuilder(new String(temp));
        int originalLength = res.length(); // store length before modifying
        for (int j = 1; j < originalLength * 2 - 1; j += 2) {
            res.insert(j, '+');
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // read input
        sc.close();

        System.out.println(processString(s));
    }
}
