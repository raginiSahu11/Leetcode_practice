import java.util.*;

public class merger_sort_6 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        merger_sort_6 obj = new merger_sort_6();

        int[] nums1 = {1, 2, 3, 0, 0, 0}; // m + n size
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}