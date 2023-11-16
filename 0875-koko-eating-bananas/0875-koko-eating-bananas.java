
class Solution {
    static int findMax(int[] piles){
        int n = piles.length;
        int max = 9999;
        for(int i=0;i<n;i++){
            if(piles[i]>max)
                max=piles[i];
        }
        return max;
    }
    static int calculateTotalHours(int[] piles,int mid){
        int totalH=0;
        int n = piles.length;
        for(int i=0;i<n;i++){
            totalH += Math.ceil(((double)piles[i]/(double)mid));
            
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1, high = findMax(piles);
        while(low<=high){
            int mid = (low+high)/2;
            int totalH = calculateTotalHours(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else 
                low=mid+1;
        }
        return low;
    }
}