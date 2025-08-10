import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String processString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        char[] temp = sb.toString().toCharArray();
        Arrays.sort(temp);
        
        StringBuilder res = new StringBuilder(new String(temp));
        for (int j = 1; j < res.length() * 2 - 1; j += 2) {
            res.insert(j, '+');
        }
        
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        System.out.println(processString(s));
    }
}
