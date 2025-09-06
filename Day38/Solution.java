import java.util.Scanner;

public class Solution {
    public static int performance(int n, int[] points) {
        int count = 0;
        int min = points[0];
        int max = points[0];
        for (int j = 1; j < n; j++) {
            if (points[j] > max) {
                count++;
                max = points[j];
            } else if (points[j] < min) {
                count++;
                min = points[j];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        System.out.println(performance(n, points));
        sc.close();
    }
}
