import java.util.Scanner;

public class Solution {
    public static long cal(long n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return -(n + 1) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        System.out.println(cal(n));
        sc.close();
    }
}
