class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=Integer.MIN_VALUE;
        int n=candies.length;
List<Boolean> result = new ArrayList<>();
        for(int x:candies){
            if(x>l){
                l=x;
            }
        }
        for(int i=0;i<n;i++){
            if( (candies[i]+extraCandies) >= l){
                result.add(true);
            }
            else
            result.add(false);
        }
        return result;
    }
}