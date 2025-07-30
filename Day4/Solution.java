import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> d = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];

            if (d.containsKey(a)) {
                return new int[] { d.get(a), i };
            } else {
                d.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
