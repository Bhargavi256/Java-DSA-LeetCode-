/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0, end =n -1;
        int peak=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start = peak = mid+1;
            }
            else 
                end = mid-1;
        }
        
        start = 0;
        end = peak;
        while(start<=end){
            int mid = (start+end)/2;
            if(mountainArr.get(mid)<target){
                start = mid+1;
            }
            else if(mountainArr.get(mid)>target)
                end = mid-1;
            else 
                return mid;
        }
        
        start = peak;
        end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mountainArr.get(mid)>target){
                start = mid+1;
            }
            else if(mountainArr.get(mid)<target)
                end = mid-1;
            else 
                return mid;
        }
        return -1;
    }
}