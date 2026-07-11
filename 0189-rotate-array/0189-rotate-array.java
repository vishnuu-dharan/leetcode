class Solution {
    static void rot(int[] nums,int l,int r){
           while(l<r){
            int tem=nums[l];
            nums[l]=nums[r];
            nums[r]=tem;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int l=0;
        int r=nums.length-1;
        // if(r<k) return ;
        k=k%nums.length;
        rot(nums,l,r);
        rot(nums,l,k-1);
         rot(nums,k,r);
        System.out.print(nums);
    }
}