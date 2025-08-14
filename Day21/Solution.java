import java.util.*;

public class Solution {

    public static int minCoins(int n, int[] coins) {
        Arrays.sort(coins); 
        int total = 0;
        for (int c : coins) total += c;

        int mySum = 0, count = 0;
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;
            if (mySum > total - mySum) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minCoins(n, coins));
    }
}
