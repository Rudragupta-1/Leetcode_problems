class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='#')
            {  
                if(!st1.isEmpty())
                st1.pop();
            }
            else{ 
                st1.push(c);
                 }
            
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
        
            if( c=='#')
            {
                if(!st2.isEmpty())
                st2.pop();
            }
            else{ 
                st2.push(c);
                 }
            
        }
        StringBuilder sss = new StringBuilder();
        while(!st1.isEmpty()) {
            sss.append(st1.pop());
        }

        StringBuilder ttt = new StringBuilder();
        while(!st2.isEmpty()) {
            ttt.append(st2.pop());
        }

        return sss.toString().equals(ttt.toString());
    }
}
