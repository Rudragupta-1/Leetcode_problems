class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<>();
        int freq[]=new int[26];
        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(visited[s.charAt(i)-'a'])
            {
                freq[s.charAt(i)-'a']--;
                continue;
            }
            while(!st.isEmpty() && s.charAt(i)<st.peek() &&freq[st.peek()-'a']>0 ){
                visited[st.peek()-'a']=false;
                st.pop();
            }
            st.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
            freq[s.charAt(i)-'a']--;
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty())
        {
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }
}
