class Solution {
    
    public static void findComb(int ind,int[] arr,int target,List<List<Integer>> ans,ArrayList<Integer> output){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            output.add(arr[i]);
            findComb(i+1,arr,target-arr[i],ans,output);
            output.remove(output.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findComb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}