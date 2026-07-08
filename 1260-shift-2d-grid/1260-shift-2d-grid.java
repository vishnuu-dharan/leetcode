class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int n) {
        int col=grid[0].length;
        int temp=0,curr=0;
        int row= grid.length;
        for(int  i=0;i<n;i++){
            int change=grid[row-1][col-1];
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    curr=grid[j][k];
                     grid[j][k]=change;
                     change=curr;
                }
            }
        }
         List<List<Integer>> li=new ArrayList();
        for(int[] i: grid) {
            List<Integer> lis=new ArrayList<>();
            for(int j:i)
            lis.add(j);
            li.add(lis);}
        return li;
    }
}