class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int []r=new int[n1.length];
        for (int i=0;i<n1.length;i++){
            r[i]=-1;
            boolean f=false;
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    f=true;
                }
                if(f && n2[j]>n1[i]){
                    r[i]=n2[j];
                    break;
                }
            }
        }return r;

        
    }
}