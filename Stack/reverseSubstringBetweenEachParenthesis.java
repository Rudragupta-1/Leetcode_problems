class Solution {
    public static void reverse(int low,int high,StringBuilder sb )
    {
        while(low<high)
        {
            char temp=sb.charAt(low);
            sb.setCharAt(low,sb.charAt(high));
            sb.setCharAt(high,temp);
            low++;
            high--;
        }
    }
    public String reverseParentheses(String s) {
        StringBuilder ss=new StringBuilder(s);
        StringBuilder res=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
            st.push(i);
        }
        else if(s.charAt(i)==')'){
            reverse(st.peek()+1,i-1,ss);
            st.pop();
        }}
        for(int i=0;i<ss.length();i++)
        {
            if(ss.charAt(i)!='(' && ss.charAt(i)!=')')
            res.append(ss.charAt(i));
        }
        return res.toString();
    }
}
