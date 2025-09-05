import java.util.Scanner;
 
public class Solution {
    public static String nextPrime(int n, int m) {
        if (!isPrime(m)) {
            return "NO";
        }
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                return "NO";
            }
        }
        return "YES";
    }
 
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        System.out.println(nextPrime(n, m));
        sc.close();
    }
}