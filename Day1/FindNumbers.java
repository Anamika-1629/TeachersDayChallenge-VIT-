public class FindNumbers {
        public int findNumbers(int[] nums) {
            int a = 0;

            for (int i = 0; i < nums.length; i++) {
                int temp = (Integer.toString(nums[i])).length();
                if (temp % 2 == 0) {
                    a += 1;
                }
            }

            return a;
        }

        public static void main(String[] args) {
            FindNumbers sol = new FindNumbers();

            System.out.println("Test case 1:");
            int[] test1 = {12, 345, 2, 6, 7896};
            System.out.println("Input: [12, 345, 2, 6, 7896]");
            System.out.println("Actual Output: " + sol.findNumbers(test1));

            System.out.println("Test case 2:");
            int[] test2 = {555, 901, 482, 1771};
            System.out.println("Input: [555, 901, 482, 1771]");
            System.out.println("Actual Output: " + sol.findNumbers(test2));

        }
    }


