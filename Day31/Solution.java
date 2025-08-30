import java.util.Scanner;

public class Solution {
    public static int magnet(int n, String[] arr) {
        int groups = 1; 
        for (int i = 0; i < n - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                groups++;
            }
        }
        return groups;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(magnet(n, arr));
        sc.close();
    }
}
