import java.util.Scanner;

public class Solution {
    public static int position(int[][] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] == 1) {
                    return Math.abs(a - 2) + Math.abs(b - 2);
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

        System.out.println("Enter the elements of the matrix (only 0's and one 1):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(position(arr));
        sc.close();
    }
}
