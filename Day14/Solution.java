import java.util.Scanner;

public class Solution{
    public static String capital(String s){
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(capital(s));
    }
}