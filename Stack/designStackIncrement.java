class CustomStack {
    ArrayList<Integer> list=new ArrayList<>();
    int size;
    public CustomStack(int maxSize) {
        size=maxSize;
    }
    
    public void push(int x) {
        if(list.size()<size)
        list.add(x);
    }
    
    public int pop() {
        if(list.size()==0)
        return -1;
        else {
            int x=list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<list.size();i++)
        {
            list.set(i,list.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
