class Solution {
    public int maxArea(int[] height) {
        int ma=0,n=height.length;
        int i=0,j=n-1;
        while(j>i){
            int w=j-i;
            int ca=Math.min(height[i],height[j])*w;
            ma=Math.max(ca,ma);
            if(height[i]>height[j]) --j;
            else ++i;
        }
        return ma;
    }
}