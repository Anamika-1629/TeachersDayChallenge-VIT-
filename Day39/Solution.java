import java.util.Scanner;

public class Solution{
    public static int countSec(int n, int[] h){
        int min = h[0];
        int max = h[0];
        int max_i = 0;
        int min_i = 0;
        int count  = 0;
        for (int j = 1; j < n; j++) {
            if (h[j] > max) {
                max = h[j];
                max_i = j;
            }
        }
        for (int j = n - 1; j >= 0; j--) {
            if (h[j] < min) {
                min = h[j];
                min_i = j;
            }
        }
        count = max_i + (n - 1 - min_i);
        if (min_i < max_i) {
            count -= 1;  
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i<n; i++){
            h[i] = sc.nextInt();
        }

        System.out.println(countSec(n, h));
    }
}