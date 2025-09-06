import java.util.Scanner;

public class Solution {
    public static String equilibrium(int n, int[][] arr) {
        int sumX = 0, sumY = 0, sumZ = 0;
        for (int x = 0; x < n; x++) {
            sumX += arr[x][0];
            sumY += arr[x][1];
            sumZ += arr[x][2];
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(equilibrium(n, arr));
        sc.close();
    }
}
