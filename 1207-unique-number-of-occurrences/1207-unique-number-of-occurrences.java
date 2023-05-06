class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> a = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
        if(a.get(arr[i])==null)
				a.put(arr[i],1);
			else {
			int count = a.get(arr[i]);
			a.put(arr[i], count+1);
			}
        }
        Set<Integer> set = new HashSet<>(a.values());
        return a.size()==set.size();
    }
}