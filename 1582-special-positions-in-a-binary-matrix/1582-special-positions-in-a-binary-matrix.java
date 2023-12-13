class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] rowA = new int[n];
        int[] colA = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    rowA[i]++;
                    colA[j]++;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && rowA[i]==1 && colA[j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}