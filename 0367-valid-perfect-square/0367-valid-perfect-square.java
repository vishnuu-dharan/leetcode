class Solution {
    public boolean isPerfectSquare(int num) {
        
        int left=0,right=num/2;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid*mid==num) return true;
            else if(mid*mid>num) right=mid-1;
            else left=mid+1;
            
        }
        return false;
    }
}