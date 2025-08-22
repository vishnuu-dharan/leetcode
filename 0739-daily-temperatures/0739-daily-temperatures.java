class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int []r=new int[n];
        Stack<Integer> s=new Stack();
        Arrays.fill(r,0);
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&t[s.peek()]<t[i]){
                r[s.peek()]=i-s.pop();
            }
            s.push(i);
        }
        return r;
        
    }
}