import java.util.Scanner;

public class Solution {
    public static String winner(String s){
        int countA = 0;
        int countD = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == 'A'){
                countA += 1;
            }
            else{
                countD += 1;
            }
        }
        if (countA > countD){
            return "Anton";
        }
        else if (countD > countA){
            return "Danik";
        }
        else{
            return "Friendship";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(winner(s));
    }    
}
