class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles)
                      .max()
                      .orElseThrow();
        int left=1,reight=max;
        while(left<reight){
            int mid=(left+reight)/2;
            int total=0;
            for(int i:piles){
                total+=(i/mid)+(i%mid!=0?1:0);
                if(total>h) break;

            }
            if(total<=h) reight=mid;
            else left=mid+1;
        }
        return left;
        
        
    }
}