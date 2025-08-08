import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int team(ArrayList<ArrayList<Integer>> input) {
        int count = 0;
        for (ArrayList<Integer> arr : input) {
            int ones = 0;
            for (int x : arr) {
                if (x == 1) ones++;
            }
            if (ones >= 2) count++; 
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> inp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int k = 0; k < 3; k++) {
                arr.add(sc.nextInt());
            }
            inp.add(arr);
        }
        sc.close();

        Solution s1 = new Solution();
        System.out.println(s1.team(inp));  
    }
}
