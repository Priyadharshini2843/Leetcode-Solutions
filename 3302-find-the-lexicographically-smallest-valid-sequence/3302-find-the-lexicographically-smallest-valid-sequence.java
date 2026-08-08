class Solution {
    public int[] validSequence(String word1, String word2) {
        byte[] b1 = word1.getBytes(), b2 = word2.getBytes();
        int n1 = b1.length, n2 = b2.length;
        int[] pref = new int[n1];
        // right to left
        for (int i = n1 - 1, j = n2 - 1; i >= 0; i--) {
            if (i < n1 - 1) {
                pref[i] = pref[i + 1];
            }
            if (j >= 0 && b1[i] == b2[j]) {
                pref[i]++;
                j--;
            }
        }
        // left to right
        int[] res = new int[n2];
        int match = 0;
        for (int i = 0, j = 0; i < n1 && j < n2; i++) {
            if (b1[i] == b2[j]) {
                res[j++] = i;
                match++;
            } else if (i < n1 - 1 && pref[i + 1] >= n2 - match - 1) {
                // greedy fill remaining
                res[j++] = i++;
                while (j < n2) {
                    if (b1[i] == b2[j]) {
                        res[j++] = i;
                    }
                    i++;
                }
                return res;
            }
        }
        // if we matched everything w/o greedy fill
        if (match == n2) {
            return res;
        }
        return new int[] {};
    }
}