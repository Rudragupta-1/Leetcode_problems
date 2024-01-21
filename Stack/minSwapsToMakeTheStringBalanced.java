class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int answer=0;
        for(int i=0;i<s.length();i++)
        {
                if(s.charAt(i)=='[')
                {
                    st.push(s.charAt(i));
                }
                else{
                    if(!st.isEmpty()&& s.charAt(i)==']')
                    {
                        st.pop();
                    }
                    else
                    {
                        answer++;
                    }
                }
        }
        return (answer+1)/2;
    }
}
