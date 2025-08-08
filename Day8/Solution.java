import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static ArrayList<String> abb(ArrayList<String> arr) {
        ArrayList<String> new_arr = new ArrayList<>();

        for (int j = 0; j < arr.size(); j++) {
            String temp = arr.get(j);
            if (temp.length() > 10) {
                String a = "" + temp.charAt(0) + (temp.length() - 2) + temp.charAt(temp.length() - 1);
                new_arr.add(a);
            } else {
                new_arr.add(temp);
            }
        }
        return new_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            arr.add(a);
        }

        sc.close();

        ArrayList<String> result = abb(arr);

        for (String word : result) {
            System.out.println(word);
        }
    }
}
