import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                l.add("FizzBuzz");
            } else if (i % 3 == 0) {
                l.add("Fizz");
            } else if (i % 5 == 0) {
                l.add("Buzz");
            } else {
                l.add(Integer.toString(i));
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 15;
        List<String> result = sol.fizzBuzz(n);

        // Print the whole list at once
        System.out.println(result);
    }
}
