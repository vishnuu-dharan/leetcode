import java.util.*;

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] f = new int[n];
        Arrays.fill(f, 1);

        // Build the f[] array where f[i] = length of
        // consecutive ascending run ending at index i.
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                f[i] = f[i - 1] + 1;
            } else {
                f[i] = 1;
            }
        }

        // Prepare result array of size n-k+1
        int[] result = new int[n - k + 1];
        for (int i = k - 1; i < n; i++) {
            // For subarray ending at i of length k
            if (f[i] >= k) {
                result[i - (k - 1)] = nums[i];
            } else {
                result[i - (k - 1)] = -1;
            }
        }
        return result;
    }
}
