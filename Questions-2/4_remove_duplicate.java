import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;        
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}