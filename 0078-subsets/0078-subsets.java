class Solution {
    public static void subseq(int i,List<List<Integer>> al,int[] nums,List<Integer> output){
        if(i==nums.length){
              al.add(new ArrayList<>(output));  
            return;
        }
        output.add(nums[i]);
        subseq(i+1,al,nums,output);
        output.remove(output.size()-1);
        subseq(i+1,al,nums,output);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        int n = nums.length;
        subseq(0,al,nums,new ArrayList<>());
        return al;
    }
}