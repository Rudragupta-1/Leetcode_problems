class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!st.isEmpty() && c=='*')
            {
                st.pop();
            }
            else if( c!='*'){
                st.push(c);
            }
        }
        StringBuilder s1=new StringBuilder();
        while(!st.isEmpty())
        {
            s1.append(st.pop());
        }
        s1.reverse();
        return s1.toString();
    }
}
