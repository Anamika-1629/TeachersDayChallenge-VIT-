import java.util.Scanner;

public class Solution{
    public static int elephant(int x){
        int step = 0;
        while (x != 0){
            if (x >= 5){
                step += 1;
                x -= 5;
            }
            else if (x >= 4 && x < 5){
                step += 1;
                x -= 4;
            }
            else if (x >= 3 && x < 4){
                step += 1;
                x -= 3;
            }
            else if (x >= 2 && x < 3){
                step += 1;
                x -= 2;
            }
            else{
                step += 1;
                x -= 1;
            }
        }
        return step;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(elephant(x));
    }
}