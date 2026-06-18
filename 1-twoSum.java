import java.util.HashMap;
import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] numbers = {2,7,11,15};
        int[] result = solution.twoSum(numbers, 9);
        System.out.println(Arrays.toString(result));
    }
}