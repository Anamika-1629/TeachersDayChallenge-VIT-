import java.util.Scanner;

public class Solution {
    public static double drinks(int n, int[] percentages){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += percentages[i];
        }
        return sum / n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] percentages = new int[n];
        for(int i = 0; i < n; i++){
            percentages[i] = sc.nextInt();
        }
        System.out.println(drinks(n, percentages));
    }
}
