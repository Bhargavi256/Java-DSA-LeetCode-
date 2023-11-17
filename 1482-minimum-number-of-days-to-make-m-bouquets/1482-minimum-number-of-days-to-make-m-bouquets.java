class Solution {
    static boolean possible(int[] arr, int mid, int r, int b){
        int cnt = 0;
        int noOfB = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                cnt++;
            }
            else {
                noOfB += (cnt/b);
                cnt=0;
            }
        }
         noOfB += (cnt/b);
         return noOfB >= r;
    }
    public int minDays(int[] arr, int r, int b) {
         long val = r * 1L * b * 1L;
        if(arr.length<val)
          return -1;
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
              min = Math.min(arr[i],min);
              max = Math.max(arr[i],max);
          }
          int low = min, high = max;
          while(low<=high){
              int mid = (low+high)/2;
              if(possible(arr,mid,r,b)){
                  high = mid -1;
              }
              else
              low=mid+1;
          }
          return low;
    }
}