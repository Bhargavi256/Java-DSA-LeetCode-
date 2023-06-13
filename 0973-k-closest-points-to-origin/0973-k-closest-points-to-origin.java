class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<tuple> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i < points.length ;i++){
            pq.add(new tuple((points[i][0]) * (points[i][0]) + (points[i][1]) * (points[i][1]) ,new pair(points[i][0] ,points[i][1])));

            if(pq.size() > k){
                pq.remove();
            }
        }
        
        int[][] ans = new int[k][2];

        int index = 0;

        while(pq.size() != 0){
            ans[index][0] = pq.peek().pair.a1;
            ans[index][1] = pq.peek().pair.b1;
            index++;
            pq.remove();
        }

        return ans;
    }
}
class pair{
    int a1;
    int b1;

    pair(int a1 ,int b1){
        this.a1 = a1;
        this.b1 = b1;
    }
}
class tuple implements Comparable<tuple>{
    int dist;
    pair pair;

    tuple(int dist , pair p){
        this.dist = dist;
        this.pair = p;
    }

    public int compareTo(tuple o){
        return o.dist - this.dist;
    }

}