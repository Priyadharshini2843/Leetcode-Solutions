class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] rank = new String[n];

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getKey()-a.getKey());

        for(int i=0;i<n;i++){
            pq.add(new Pair<>(score[i],i));
        }

        int place=1;


        while(!pq.isEmpty()){

            Pair<Integer,Integer> pair = pq.poll();
            int originalIndex = pair.getValue();
            if(place==1){
                rank[originalIndex] = "Gold Medal";
            } 
            else if(place==2){
                rank[originalIndex] = "Silver Medal";


            }
            else if(place==3){
                rank[originalIndex] = "Bronze Medal";
            }
            else{
           rank[originalIndex] = String.valueOf(place);
                   }
        place++;
        }

return rank;
    }
}