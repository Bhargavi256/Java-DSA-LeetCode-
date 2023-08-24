class Solution {
    
    public static void findComb(int i,int[] arr,int target,List<List<Integer>> ans, ArrayList<Integer> output){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(output));
            }
            return;
        }
        if(arr[i]<=target){
            output.add(arr[i]);
            findComb(i,arr,target-arr[i],ans,output);
            output.remove(output.size()-1);
        }
        findComb(i+1,arr,target,ans,output);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         findComb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}