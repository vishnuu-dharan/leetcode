class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] lm=new int[n];
        int []rm = new int[n];
        lm[0]=h[0];
        rm[n-1]=h[n-1];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(lm[i-1],h[i]);
        }
        for(int j=n-2;j>=0;j--){
            rm[j]=Math.max(rm[j+1],h[j]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(lm[i],rm[i])-h[i];
        }
        return res;
    }
}