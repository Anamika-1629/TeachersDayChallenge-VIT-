import java.util.Scanner;

public class Solution {
    public static char[] maths(String a, String b){
        int n = a.length(); 
        char[] res = new char[n];
        for (int i = 0; i < n; i++){
            res[i] = (a.charAt(i) != b.charAt(i)) ? '1' : '0';
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(new String(maths(a, b)));
        sc.close();
    }
}
