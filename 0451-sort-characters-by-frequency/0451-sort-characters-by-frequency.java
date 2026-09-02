class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        //count frequency 
        for(int i = 0; i < s.length(); i++) { //O(n)
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        //max heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet()); //O(k log k)

        //build result
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char ch = pq.poll(); //O(k log k)
            int count = freq.get(ch);

            for(int i = 0; i < count; i++) { //O(n)
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}