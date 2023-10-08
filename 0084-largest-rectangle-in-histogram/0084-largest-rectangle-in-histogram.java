class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        int[] width = new int[n];
        int[] area = new int[n];
        int result;
        
        nsr = smallestRight(heights);
        for(int i=0;i<nsr.length;i++){
            System.out.print(nsr[i]+" ");
        }
        nsl = smallestLeft(heights);
        for(int i=0;i<nsl.length;i++){
            System.out.print(nsl[i]+" ");
        }
        int max=0;
        for(int i=0;i<n;i++){
            width[i] = nsr[i]-nsl[i]-1;
            area[i] = heights[i]*width[i];
            if(max<area[i])
                max=area[i];
        }
        return max;
    }
    
    int[] smallestRight(int[] heights){
        Stack<Pair> st = new Stack<>();
        int[] nsr = new int[heights.length];
        
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().val>=heights[i])
                st.pop();
            if(st.isEmpty())
                 nsr[i] = heights.length;
            else
                nsr[i] = st.peek().ind;
            Pair pair = new Pair(heights[i],i);
		    st.push(pair);
        }
        return nsr;
    }
    int[] smallestLeft(int[] heights){
        Stack<Pair> st = new Stack<>();
        int[] nsl = new int[heights.length];
        
        for(int i=0;i<heights.length;i++){
           // System.out.print("elo");
            while(!st.isEmpty() && st.peek().val>=heights[i])
                st.pop();
            if(st.isEmpty())
                 nsl[i] = -1;
            else
                nsl[i] = st.peek().ind;
            Pair pair = new Pair(heights[i],i);
		    st.push(pair);
        }
        return nsl;
    }
}
class Pair{
   int val;
	int ind;
	public Pair(int val, int ind) {
		
		this.val = val;
		this.ind = ind;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public int getInd() {
		return ind;
	}
	public void setInd(int ind) {
		this.ind = ind;
	}
	

}