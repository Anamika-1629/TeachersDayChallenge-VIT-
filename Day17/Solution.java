import java.util.Scanner;

public class Solution {
    public static int stone(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt(); 
        sc.nextLine();
        String colors = sc.nextLine();
        
        System.out.println(stone(colors));
        
        sc.close();
    }
}
