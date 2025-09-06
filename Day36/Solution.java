import java.util.Scanner;

public class Solution{
    public static boolean luckyNo(int num){
        String temp = Integer.toString(num);
        for (int i = 0; i<temp.length(); i++){
            if (temp.charAt(i) != '4' && temp.charAt(i) != '7'){
                return false;
            }            
        }
        return true;
    }
    public static String luckyDivisor(int n){
        for (int i = 1; i <= n; i++) {
            if (luckyNo(i) && n % i == 0) {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(luckyDivisor(n));
    }
}