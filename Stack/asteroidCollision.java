class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int x:arr)
        {
            if(st.isEmpty() || x>0)
            st.push(x);
            else{
                while(true)
                {
                    if(st.peek()<0){
                        st.push(x);
                        break;
                    }
                    else if(st.peek()==-x)
                    {
                        st.pop();
                        break;
                    }
                    else if(st.peek()>-x)
                    {
                        break;
                    }
                    else{
                        st.pop();
                        if(st.isEmpty()){
                        st.push(x);
                        break;}
                    }
                }
            }
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}
