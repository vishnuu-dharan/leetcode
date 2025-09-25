class Solution {
    public int minimumMoves(String s) {
        int c=0,tot=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='X'){
                c++;
                tot+=1;
                i+=2;
            }
        }
        if (c==0) return 0;

        return tot;
    }
}