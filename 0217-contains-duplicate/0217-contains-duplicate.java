class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();

        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }
            map.put(i,true);
        }
        return false;
    }
}