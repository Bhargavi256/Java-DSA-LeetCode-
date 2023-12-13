class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                if(al.size()==0 || al.get(al.size()-1)!=nums1[i]){
                    al.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                  i++;
            else
                 j++;
        }
        int[] a = new int[al.size()];
        int k=0;
        for(int l=0;l<al.size();l++){
            a[k]=al.get(l);
            k++;
        }
        return a;
    }
}