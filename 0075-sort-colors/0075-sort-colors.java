class Solution {
    
    public void sortColors(int[] nums) {
        int  nz=0,i=0;
        int nt = (nums.length)-1;
        while(i<=nt){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i]=nums[nz];
                nums[nz]=temp;
                i++;
                nz++;
            }
            else if(nums[i]==2)
            {
                 int temp = nums[i];
                nums[i]=nums[nt];
                nums[nt]=temp;
               
                nt--;
            }
            else
             i++;
        }
    }
}