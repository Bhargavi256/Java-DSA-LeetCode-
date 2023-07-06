class Solution {
    public int searchInsert(int[] nums, int target) {
        // if(nums[0]>target)
        //    return 0;
        //  for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target)
        //        return i;
        //     else{
        //         if(i==nums.length-1 || nums[i]<target && nums[i+1]>target)
        //               return i+1;
        //     }
        // }
        // return 0;
        
        int start = 0;
        int end = nums.length-1;
        
        int res=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target )
               return mid;
            if(nums[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return start;
    }
}