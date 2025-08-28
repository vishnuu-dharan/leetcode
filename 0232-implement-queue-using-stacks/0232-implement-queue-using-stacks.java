class MyQueue {
    Deque<Integer> q;

    public MyQueue() {
        q=new ArrayDeque();
        
    }
    
    public void push(int x) {
        q.addLast(x);
        
    }
    
    public int pop() {
        return q.removeFirst();
        
    }
    
    public int peek() {
        return q.peekFirst();
        
    }
    
    public boolean empty() {
        return (q.isEmpty());
        
    }
}

