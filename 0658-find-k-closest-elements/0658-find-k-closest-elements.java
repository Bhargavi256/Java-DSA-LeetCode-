class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i: arr){
            heap.add(new Pair(Math.abs(i-x),i));
            if(heap.size()>k)
                heap.poll();     
        }
        while(!heap.isEmpty()){
            al.add(heap.poll().data);
        }
        Collections.sort(al);
                     return al;
    }
}
class Pair implements Comparable<Pair>{
    int key;
    int data;
    Pair(int key,int data){
        this.key = key;
        this.data = data;
    }
    @Override
    public int compareTo(Pair o){
        return this.key>o.key?1:-1;
    }
}
