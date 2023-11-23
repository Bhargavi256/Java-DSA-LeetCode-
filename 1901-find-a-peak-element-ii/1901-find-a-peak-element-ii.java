class Solution {
    static int findMaxIndex(int[][] mat,int n,int m,int mid){
        int maxVal = -1;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxVal){
                maxVal=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
         int n = mat.length;
       int m = mat[0].length;
       int low = 0, high = m-1;
       int[] a = new int[2];
       while(low<=high){
           int mid = (low+high)/2;
           int maxRowIndex = findMaxIndex(mat,n,m,mid);
           int left = mid-1>=0?mat[maxRowIndex][mid-1]:-1;
           int right = mid+1<m?mat[maxRowIndex][mid+1]:-1;
           if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right)
              {
                 a[0]=maxRowIndex;
                 a[1]=mid;
              
              return a;
              }
           else if(mat[maxRowIndex][mid]<left){
               high = mid-1;
           }
           else 
              low=mid+1;
       }
        a[0]=-1;
        a[1]=-1;
       return a;
    }
}