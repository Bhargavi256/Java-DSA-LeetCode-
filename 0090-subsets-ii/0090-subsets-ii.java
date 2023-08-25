class Solution {
    
    public static void findComb(int ind,int[] nums,List<List<Integer>> ans,List<Integer> output){
        ans.add(new ArrayList<>(output));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            output.add(nums[i]);
            findComb(i+1,nums,ans,output);
            output.remove(output.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findComb(0,nums,ans,new ArrayList<>());
        return ans;
    }
}