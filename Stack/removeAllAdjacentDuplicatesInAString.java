class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }
            else st.push(c);
        }
        char res[]=new char[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
              res[i]=st.pop();
        }
        return new String(res);
    }
}
