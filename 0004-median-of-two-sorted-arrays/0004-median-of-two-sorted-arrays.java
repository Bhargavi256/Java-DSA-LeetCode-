class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length + b.length;
        int ind1 = n/2;
        int ind2 = ind1-1;
        int cnt = 0;
        int ind1el = -1, ind2el=-1;
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(cnt==ind1) ind1el = a[i];
                if(cnt==ind2) ind2el = a[i];
                cnt++;
                i++;
            }
            else{
              if(cnt==ind1) ind1el = b[j];
                if(cnt==ind2) ind2el = b[j];
                cnt++;
                j++;  
            }
        }
        while(i<a.length){
                if(cnt==ind1) ind1el = a[i];
                if(cnt==ind2) ind2el = a[i];
                cnt++;
                i++;
        }
        while(j<b.length){
            if(cnt==ind1) ind1el = b[j];
                if(cnt==ind2) ind2el = b[j];
                cnt++;
                j++; 
        }

        if(n%2==1){
            return ind1el;
        }
        return (double)((double)(ind1el+ind2el))/2.0;
    }
}