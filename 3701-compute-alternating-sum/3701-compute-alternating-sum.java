class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        boolean flag=true;
        for(int i:nums){
            if(flag==true){
                sum+=i;
            }
            else sum-=i;
            flag=!flag;
        }
        
    return sum;
    }
}