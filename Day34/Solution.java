import java.util.Scanner;
 
public class Solution {
    int n;
    int[] p;
 
    public Solution(int n, int[] p) {
        this.n = n;
        this.p = p;
    }
 
    public int[] findGivers() {
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (p[j - 1] == i) {
                    result[i - 1] = j;
                    break;
                }
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Solution presents = new Solution(n, p);
        int[] result = presents.findGivers();
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + (i == n - 1 ? "\n" : " "));
        }
        sc.close();
    }
}