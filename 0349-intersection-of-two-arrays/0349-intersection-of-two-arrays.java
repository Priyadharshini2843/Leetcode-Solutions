class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // Store unique elements of nums1
        for (int num : nums1) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Find common elements
        for (int num : nums2) {

            if (set.contains(num)) {

                result.add(num);

                // Remove to avoid duplicates
                set.remove(num);
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}