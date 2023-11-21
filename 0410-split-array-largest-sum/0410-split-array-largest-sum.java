class Solution {
    static int func(int[] nums,int k,int mid){
        int pages = 0;
        int students=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+pages<=mid){
                pages += nums[i];
            }
            else{
                students++;
                pages = nums[i];
            }
        }
        return students;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high = high + nums[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            int cntStudents = func(nums,k,mid);
            if(cntStudents<=k)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}