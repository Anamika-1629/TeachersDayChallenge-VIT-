import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
    public static int round(ArrayList<Integer> arr, int k){
        int count = 0;
        for(int j = 0; j<arr.size(); j++){
            if (arr.get(j) >= k){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList <Integer> arr = new ArrayList<>();

        for (int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }
        Solution s1 = new Solution();
        System.out.println(s1.round(arr,k));
    }
}