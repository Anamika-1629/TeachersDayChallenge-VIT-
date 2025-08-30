import java.util.Scanner;

public class Solution{
    public static String luckyNo(int n){
        String temp = Integer.toString(n);
        for(int i = 0; i<temp.length(); i++){
            if ((temp.charAt(i) != '4') && (temp.charAt(i) != '7')){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(luckyNo(n));
    }
}