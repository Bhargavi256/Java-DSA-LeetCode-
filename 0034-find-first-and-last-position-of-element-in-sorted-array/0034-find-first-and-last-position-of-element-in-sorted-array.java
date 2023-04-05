class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int f=0,g=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
              a[0]=i;
              f=1;
              break;
              }
        }
        for(int j=nums.length-1;j>0;j--){
            if(nums[j]==target){
              a[1]=j;
              g=1;
              break;
              }
        }
        if(f!=1&&g!=1)
           {
               a[0]=-1;
               a[1]=-1;
           }
    return a;

    }
}