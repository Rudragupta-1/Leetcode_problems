class FrontMiddleBackQueue {
  Queue<Integer> q;
  public FrontMiddleBackQueue() {
      q=new LinkedList<>();
  }
  
  public void pushFront(int val) {
      q.add(val);
      int x=q.size();
      while(x--!=1){
          q.add(q.remove());
      }
  }
  
  public void pushMiddle(int val) {
      int a=q.size()/2;
      int b=q.size()-a;
      while(a-->0){
          q.add(q.remove());
      }
      q.add(val);
      while(b-->0){
          q.add(q.remove());
      }
  }
  
  public void pushBack(int val) {
      q.add(val);
  }
  
  public int popFront() {
      if(q.isEmpty())
      return -1;
      return q.remove();
  }
  
  public int popMiddle() {
      if(q.isEmpty())
      return -1;
      int res=0;
      if(q.size()%2==0)
      {
   int a=q.size()/2-1;
      int b=q.size()/2;
      while(a-->0){
          q.add(q.remove());
      }
      res=q.remove();
      while(b-->0){
          q.add(q.remove());
      }
      }
      else{
     int a=q.size()/2;
      int b=a;
      while(a-->0){
          q.add(q.remove());
      }
      res=q.remove();
      while(b-->0){
          q.add(q.remove());
      }
      }
      return res;
  }
  
  public int popBack() {
      if(q.isEmpty())
      return -1;
      int a=q.size();
      while(a--!=1){
          q.add(q.remove());
      }
      return q.remove();
  }
}

/**
* Your FrontMiddleBackQueue object will be instantiated and called as such:
* FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
* obj.pushFront(val);
* obj.pushMiddle(val);
* obj.pushBack(val);
* int param_4 = obj.popFront();
* int param_5 = obj.popMiddle();
* int param_6 = obj.popBack();
*/