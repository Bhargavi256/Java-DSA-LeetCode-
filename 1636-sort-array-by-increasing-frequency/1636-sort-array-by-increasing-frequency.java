class Solution {
    public int[] frequencySort(int[] nums) {
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
        
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            heap.add(new Pair(mp.getValue(),mp.getKey()));
        }
        int[] arr = new int[nums.length];
        int j=0;
        while(!heap.isEmpty()){
            int freq = heap.peek().key;
            int val = heap.peek().data;
            
            for(int i=1;i<=freq;i++){
               arr[j]=val;
              
                j++;
            }
            heap.poll();
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
    public int compareTo(Pair p){
        if(this.key == p.key)
            return p.data-this.data;
        return this.key-p.key;
    }
}