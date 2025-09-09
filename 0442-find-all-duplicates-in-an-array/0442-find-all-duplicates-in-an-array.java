class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map <Integer,Integer> hm=new HashMap<>();
        List<Integer> l=new ArrayList();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else hm.put(i,1);
        }
        // List<Integer> num = new ArrayList<>( new HashSet(nums));
         for(int i:hm.keySet()){
            if(hm.get(i)>1){
               l.add(i);
            }
        }
        return l;
        
    }
}