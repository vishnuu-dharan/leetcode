class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int []r=new int[n1.length];
        Map<Integer,Integer> hm=new HashMap();
        Stack<Integer> s= new Stack();
        for(int e:n2){
            while(!s.isEmpty()&&s.peek()<e){
                hm.put(s.pop(),e);
            }
            s.push(e);
        }
        for(int i=0;i<n1.length;i++){
            r[i]=hm.containsKey(n1[i])?hm.get(n1[i]):-1;
        }
        return r;

        
    }
}