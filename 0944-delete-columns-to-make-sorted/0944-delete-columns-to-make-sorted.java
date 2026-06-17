class Solution {
    public int minDeletionSize(String[] s) {
        int n = s.length, m = s[0].length();
        int count = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                if (s[i].charAt(j) < s[i - 1].charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}