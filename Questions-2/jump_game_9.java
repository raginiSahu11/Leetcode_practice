public class jump_game_9 {

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }

    public static void main(String[] args) {
        // Sample Input
        int[] nums = {2, 3, 1, 1, 4};

        // Function Call
        boolean result = canJump(nums);

        // Output
        System.out.println("Can reach last index: " + result);
    }
}