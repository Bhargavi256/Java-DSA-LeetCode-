class Solution {
    static int func(int[] weights,int mid){
        int day = 1;
        int load = 0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                day=day+1;
                load=weights[i];
            }
            else
                load += weights[i];
            
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0;i<weights.length;i++){
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            int noOfDays = func(weights,mid);
            if(noOfDays<=days)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}