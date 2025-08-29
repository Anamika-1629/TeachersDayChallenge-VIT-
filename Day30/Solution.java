import java.util.Scanner;

public class Solution{
    public static int BearBrother(int a, int b){
        int i = 0;
        while (a <= b){
            a *= 3;
            b *= 2;
            i++;
        }
        return i;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(BearBrother(a, b));
    }
}