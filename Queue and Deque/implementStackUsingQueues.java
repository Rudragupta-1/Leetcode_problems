class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty())
        q1.add(x);
        else q2.add(x);
    }
    
    public int pop() {
        int res=0;
        if(!q1.isEmpty())
        {
            while(q1.size()!=1)
            {
                q2.add(q1.remove());
            }
            res=q1.remove();
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        else{
            while(q2.size()!=1)
            {
                q1.add(q2.remove());
            }
            res=q2.remove();
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
        }
        return res;
    }
    
    public int top() {
        int res=0;
        if(!q1.isEmpty())
        {
            while(q1.size()!=1)
            {
                q2.add(q1.remove());
            }
            res=q1.remove();
            q2.add(res);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        else{
            while(q2.size()!=1)
            {
                q1.add(q2.remove());
            }
            res=q2.remove();
            q1.add(res);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
        }
        return res;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty())
        return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
