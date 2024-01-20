class Solution {
    public int evalRPN(String[] tockens) {
        Stack<Integer> st=new Stack<>();
        
        int n=tockens.length;
        for(int i=0;i<n;i++)
        {
            String d=tockens[i];
            if(!isOperator(d)){
            int g=Integer.parseInt(tockens[i]);
            st.push(g);}
            else{
                int x=st.pop();
                int y=st.pop();
                if(tockens[i].equals("*")){
                st.push(y*x);}
                else if(tockens[i].equals("/")){
                st.push(y/x);}
                else if(tockens[i].equals("-")){
                st.push(y-x);}
                else {st.push(y+x);}
            }
        }
        return st.pop();
    }
    public static boolean isOperator(String x){
        return (x.equals("+")||x.equals("*")||x.equals("/")||x.equals("-"));
    }
}
