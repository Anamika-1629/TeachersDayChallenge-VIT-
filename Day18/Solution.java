import java.util.Scanner;

public class Solution {
    public static int bit(String[] arr){
        int x = 0;
        for (int j = 0; j<arr.length; j++){
            if (arr[j].equals("++X") || arr[j].equals("X++")){
                x++;
            }
            else if (arr[j].equals("--X") || arr[j].equals("X--")){
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        sc.close();

        System.out.println(bit(arr));
    }    
}
