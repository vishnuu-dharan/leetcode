class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> pair:hm.entrySet()){
            int n=pair.getValue();
            sum+=n*(n-1)/2;
        }
        return sum;
        
    }
}