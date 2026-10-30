class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;
        List<Integer> ans = new ArrayList<>();
        while(top<=bottom && left <=right) {
        for(int i=left; i<=right; i++)
        ans.add(a[top][i]);
        top++;
        for(int i=top; i<=bottom; i++)
        ans.add(a[i][right]);
        right--;
        if(top<=bottom){
            for(int i=right; i>= left; i--)
            ans.add(a[bottom][i]);
            bottom--;
        }
        if(left<=right) {
            for(int i=bottom ; i>=top; i--)
            ans.add(a[i][left]);
            left++;
        }
        }
        return ans;
    }
}