import java.util.Scanner;

public class Solution {
    public static int domino(int m, int n) {
        if ((m * n) % 2 == 0) {
            return (m * n) / 2;
        } else {
            return ((m * n) - 1) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(domino(m, n));
    }
}
