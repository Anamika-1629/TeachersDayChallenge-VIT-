import java.util.Scanner;

public class Solution {
    public static String football(String s){
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                if (count >= 7) {
                    return "YES";
                }
            } 
            else {
                count = 1; 
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(football(s));
    }
}
