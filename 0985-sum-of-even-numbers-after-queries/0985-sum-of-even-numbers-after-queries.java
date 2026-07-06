class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;

        // Calculate initial sum of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int value = queries[i][0];
            int index = queries[i][1];

            // If the original number at index is even, subtract it from the sum
            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }

            // Update the number at index
            nums[index] += value;

            // If the updated number at index is even, add it to the sum
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            // Append the current sum of even numbers to the result
            result[i] = sum;
        }

        return result;
    }
};