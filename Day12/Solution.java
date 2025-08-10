
import java.util.Scanner;

public class Solution {
    public static int compare(String a, String b){
        String t1 = a.toLowerCase();
        String t2 = b.toLowerCase(); 
        
        if (t1.compareTo(t2) < 0){
            return -1;
        }
        else if (t1.compareTo(t2) > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        
        System.out.println(compare(a,b));
    }
}