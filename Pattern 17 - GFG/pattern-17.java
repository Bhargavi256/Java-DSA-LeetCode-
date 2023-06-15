//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
           char ch ='A';
           int breakpoint = (2*i+1)/2;
            for(int k=1;k<=2*i+1;k++){
               System.out.print(ch);
               if(k<=breakpoint)
                  ch++;
               else
                  ch--;
           }
            System.out.println();
       }
    }
}