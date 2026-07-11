import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // If there are fewer than 3 elements, no triplet is possible.
        if (nums == null || nums.length < 3) {
            return result;
        }

        // Sort the array.
        Arrays.sort(nums);

        // Fix the first element of the triplet.
        for (int i = 0; i < nums.length - 2; i++) {

            // Since the array is sorted, if the current number is positive,
            // no three numbers can sum to 0.
            if (nums[i] > 0) {
                break;
            }

            // Skip duplicate values for the first element.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the second element.
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate values for the third element.
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}