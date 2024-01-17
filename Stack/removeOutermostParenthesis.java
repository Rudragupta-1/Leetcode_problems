class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String sr="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(!st.isEmpty())
                {
                    sr+="(";
                }
                st.push('(');
            }
            else {
                st.pop();
                if(!st.isEmpty())
                sr+=")";
            }
        }
        return sr;
    }
}
