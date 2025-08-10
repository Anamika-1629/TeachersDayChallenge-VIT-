import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
    public static String gender(String s){
        ArrayList <Character> temp = new ArrayList<>();
        for (int i = 0; i<s.length(); i++){
            if (!temp.contains(s.charAt(i))){
                temp.add(s.charAt(i));
            }
        }

        if (temp.size() % 2 == 0){
            return "CHAT WITH HER";
        }
        else{
            return "IGNORE HIM";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(gender(s));
    }
}