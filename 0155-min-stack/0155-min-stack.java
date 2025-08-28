class MinStack {
    Stack<int[]>s;

    public MinStack() {
     s = new Stack();        
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new int[] {val,val});
            return;
        }
        int currmin=s.peek()[1];
        s.push(new int[] {val,Math.min(currmin,val)});
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
       return  s.peek()[0];
        
    }
    
    public int getMin() {
        return s.peek()[1];
    }
}

