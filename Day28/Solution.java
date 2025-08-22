import java.util.Scanner;

public class Solution {
    public static int maxWateredSections(int n, int[] heights) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 1;            
            int j = i - 1;
            while (j >= 0 && heights[j] <= heights[j + 1]) {
                cnt++;
                j--;
            }
            
            j = i + 1;
            while (j < n && heights[j] <= heights[j - 1]) {
                cnt++;
                j++;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxWateredSections(n, heights));
    }
}
