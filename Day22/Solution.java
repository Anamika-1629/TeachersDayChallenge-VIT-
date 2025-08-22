import java.util.Scanner;

public class Solution {
    public static String schoolqueue(String s, int t){
        char[] q = s.toCharArray();
        int l = q.length;

        for (int a = 0; a<t; a++){
            int i = 0;
            while (i< l-1){
                if (q[i] == 'B' && q[i+1] == 'G'){
                    q[i] = 'G';
                    q[i+1]  = 'B';
                    i += 2;
                }
                else{
                    i++;
                }
            }
        }
        return String.valueOf(q);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(schoolqueue(s, t));
    }
}
