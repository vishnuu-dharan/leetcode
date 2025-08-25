class Solution {
    public int singleNumber(int[] nums) {
       Map <Integer,Integer> hm=new HashMap();
       for(int i:nums){
        if(hm.isEmpty() || !hm.containsKey(i)){hm.put(i,1);

        }
        else if(hm.containsKey(i)){
            hm.put(i,hm.get(i)+1);
        }
       }
       for(int i:nums){
        if(hm.get(i)==1) 
        return i;
       }
       return nums[0];
    }
}
