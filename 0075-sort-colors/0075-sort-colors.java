class Solution {
    public void sortColors(int[] nums) {
        int itr=0,zeroid=0,twoid=nums.length-1;
        while(itr<=twoid){
           if(nums[itr]==0){
                int temp;
                temp=nums[itr];
                nums[itr]=nums[zeroid];
                nums[zeroid]=temp;
                ++itr;
                ++zeroid;}
                else if(nums[itr]==1) ++itr;
                else{
                    int temp;
                    temp=nums[itr];
                    nums[itr]=nums[twoid];
                    nums[twoid]=temp;
                    --twoid;
                }

        }
        
    }
}