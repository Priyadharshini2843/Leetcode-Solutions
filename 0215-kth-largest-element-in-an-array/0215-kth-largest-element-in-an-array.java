class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
int ans=0;

for(int x:nums){
    pq.add(x);
}
        for(int i=1;i<=k;i++){
            if(i!=k)
            pq.poll();

            if(i==k){
         ans = pq.poll();
            }
        }
        return ans;
    }
}