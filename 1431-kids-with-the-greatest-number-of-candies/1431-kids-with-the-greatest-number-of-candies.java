class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(candies[i],max);
        }
        ArrayList<Boolean> al = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                al.add(true);
            }
            else
                al.add(false);
        }
        return al;
    }
}