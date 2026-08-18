import java.util.*;

class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        // HashMap stores:
        // prefix sum -> number of times it appeared
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        // Prefix sum 0 occurs once before starting
        prefixMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            // Calculate current prefix sum
            prefixSum += num;

            // If (prefixSum - k) exists,
            // a subarray with sum k is found
            int requiredSum = prefixSum - k;

            if (prefixMap.containsKey(requiredSum)) {
                count += prefixMap.get(requiredSum);
            }

            // Store/update current prefix sum
            prefixMap.put(
                prefixSum,
                prefixMap.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Input Array:");
        System.out.println(Arrays.toString(nums));

        System.out.println("Target Sum: " + k);

        int result = subarraySum(nums, k);

        System.out.println(
            "Number of Subarrays with Sum " + k + ": " + result
        );
    }
}
