class Solution {
    static int sumD(int[] arr,int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += Math.ceil((double)arr[i]/(double)mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(sumD(nums,mid)<=threshold){
                high = mid-1;
            }
            else 
                low=mid+1;
        }
        return low;
    }
}