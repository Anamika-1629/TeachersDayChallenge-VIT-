import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int round(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) >= k && arr.get(j) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        k = arr.get(k - 1);

        System.out.println(round(arr, k));
        sc.close();
    }
}
