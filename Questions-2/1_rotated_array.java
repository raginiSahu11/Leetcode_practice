import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);   // Step 1
        reverse(nums, 0, k - 1);   // Step 2
        reverse(nums, k, n - 1);   // Step 3
    }

    void reverse(int[] nums, int s, int e) {
        while (e > s) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};  
        int k = 3;

        obj.rotate(nums, k);

        System.out.println("Rotated Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}