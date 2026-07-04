class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for(int i=1; i<intervals.length; i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int lastEnd = current[1];
            if(start <= lastEnd)
            current[1] = Math.max(lastEnd,end);
            else{
                current=intervals[i];
                result.add(current);
            }
            
        }
        return result.toArray(new int[result.size()][]);
    }
}