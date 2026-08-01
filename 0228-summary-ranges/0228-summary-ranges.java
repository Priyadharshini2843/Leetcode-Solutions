class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        
        int first = nums[0]; // start of current range
        int last = nums[0];  // end of current range
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                // not consecutive → close the current range
                if (first == last) {
                    res.add("" + first);
                } else {
                    res.add(first + "->" + last);
                }
                // start a new range
                first = nums[i];
                last = nums[i];
            } else {
                // consecutive → extend the range
                last = nums[i];
            }
        }
        
        // add the last range
        if (first == last) {
            res.add( "" + first);
        } else {
            res.add(first + "->" + last);
        }
        
        return res;
    }
}