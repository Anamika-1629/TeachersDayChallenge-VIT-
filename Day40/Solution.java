import java.util.Scanner;

public class Solution {
    public static int vacancy(int n, int[][] room) {
        int count = 0;
        for (int x = 0; x < n; x++) {
            int p = room[x][0]; 
            int q = room[x][1];  
            if ((q - p) >= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] room = new int[n][2];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                room[i][j] = sc.nextInt();
            }
        }
        System.out.println(vacancy(n, room));
        sc.close();
    }
}
