class Solution {
    public int findMin(int[] nums) {
        int left =0,right=nums.length-1;
        int n=nums.length-1;
        if(nums[0]<=nums[n]) return nums[0];
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[mid]<nums[n]) right=mid-1;
            else left=mid+1;

        }return nums[left];

        
    }
}