class Solution {
    public int maximalSquare(char[][] m) {
        if(m.length==0||m[0].length==0|| m==null) return 0;
        int row= m.length;
        int max=0;
        int col=m[0].length;
        for(int i=0;i<row;i++) if(m[i][0]=='1' ) max=1;
        for(int i=0;i<col;i++) if(m[0][i]=='1' ) max=1;

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(m[i][j]=='1'){
                    int check= 1 + Math.min(m[i-1][j]-'0',Math.min(m[i][j-1]-'0',m[i-1][j-1]-'0'));
                    m[i][j]=(char) (check+'0');
                    max=Math.max(check,max);
                }
            }
        }
        return max*max;
        
    }
}