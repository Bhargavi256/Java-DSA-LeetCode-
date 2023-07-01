class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pI = 0, nI=1;
        int n = nums.length;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                a[nI]=nums[i];
                nI +=2;
            }
            else{
                a[pI] = nums[i];
                pI+=2;
            }
        }
        return a;
    }
}