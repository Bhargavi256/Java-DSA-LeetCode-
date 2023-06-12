class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       PriorityQueue<Pair> heap = new PriorityQueue<>();
       Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i]))
          {
              int count = map.get(nums[i]);
              map.put(nums[i],count+1);
          }
          else{
              map.put(nums[i],1);
          }
        }
        for (Map.Entry<Integer,Integer> mp : map.entrySet()) {
            
            heap.add(new Pair(mp.getValue(),mp.getKey()));
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] arr = new int[k];
        while(!heap.isEmpty()){
            for(int i=0;i<k;i++){
                arr[i]=heap.poll().data;
            }
        }
        return arr;
    }
}
class Pair implements Comparable<Pair>{
    int key;
    int data;
    Pair(int key,int data){
        this.key=key;
        this.data=data;
    }
    @Override
    public int compareTo(Pair o){
        return this.key>o.key?1:-1;
    }
}