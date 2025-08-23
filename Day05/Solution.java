import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = roman.get(s.charAt(i));
            if (i + 1 < s.length() && roman.get(s.charAt(i + 1)) > a) {
                res -= a;
            } else {
                res += a;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String romanNumeral = "MCMXCIV";  // Example: 1994
        int result = solution.romanToInt(romanNumeral);

        System.out.println("Roman numeral: " + romanNumeral);
        System.out.println("Integer value: " + result);
    }
}
