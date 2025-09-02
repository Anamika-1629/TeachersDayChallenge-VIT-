import java.util.Scanner;

public class Solution {
    public static char[] maths(int a, int b){
        String t1 = Integer.toString(a);
        String t2 = Integer.toString(b);
        int n = t1.length();
        char[] res = new char[n];
        for (int i = 0; i<t1.length(); i++){
            if (((t1.charAt(i) == '0') && (t2.charAt(i) == '1')) || ((t1.charAt(i) == '1') && (t2.charAt(i) == '0'))){
                res[i] = '1';
            }
            else{
                res[i] = '0';
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(maths(a, b));
        sc.close();
    }
}
