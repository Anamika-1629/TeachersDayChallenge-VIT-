import java.util.Scanner;

public class Solution {
    public static String casechange(String s){
        int uc = 0;
        int lc = 0;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                uc++;
            }
            else{
                lc++;
            }
        }

        if (uc > lc){
            return s.toUpperCase();
        }
        else{
            return s.toLowerCase();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(casechange(s));
    }    
}
