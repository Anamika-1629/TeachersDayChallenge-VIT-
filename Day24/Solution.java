import java.util.Scanner;

public class Solution{
    public static int borrow(int k, int n, int w){
        int cost = 0;
        for (int i = 1; i <= w; i++){
            cost += i*k;
        }
        int b = cost - n;
        if (b < 0){
            b = 0;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        System.out.println(borrow(k, n, w));
    }
}