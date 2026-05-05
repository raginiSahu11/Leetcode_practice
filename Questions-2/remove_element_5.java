import java.util.*;

class Remove_Element_5 {

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Remove_Element_5 obj = new Remove_Element_5();

        int[] nums = {3, 2, 2, 3};  // Sample Input
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}