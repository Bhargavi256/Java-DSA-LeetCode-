//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {

       int []nums = arr;
        int res = -1;
        int start = 0;
        int end = nums.length-1;
        int mid=0;
        int target = x;
         // System.out.print(start+" start ");
         // System.out.print(mid+" mid ");
         // System.out.println(end+" end ");
        while(start<=end){
             mid =start + (end-start)/2;
            if(nums[mid]==target){
                //System.out.print(mid+"mid");
              res   = mid;
                end = mid-1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
                 //System.out.print(end+"end");
            }
            else 
                start = mid+1;
             //System.out.print(start+"start");
        }
      
         start = 0;
         end = nums.length-1;
         int res1=-1;
        while(start<=end){
             mid = (start+end)/2;
            if(nums[mid]==target){
                res1 = mid;
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else 
                start = mid+1;
        }
        if(res==-1&&res1==-1)
           return 0;
     return res1-res+1;
    }
}