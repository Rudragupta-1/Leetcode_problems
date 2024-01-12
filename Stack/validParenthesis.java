class Solution {
  public boolean isValid(String st) {
      Stack<Character> s=new Stack<>();
      int n=st.length();
      for(int i=0;i<n;i++)
      {
          char ch=st.charAt(i);
          if(ch=='(' ||ch=='{' ||ch=='[' )
          s.push(ch);
          else{
              if(s.isEmpty())
              return false;
              if((s.peek()=='(' && ch==')') ||(s.peek()=='{' && ch=='}') ||(s.peek()=='[' && ch==']') ){
                  s.pop();
              }
              else return false;
          }
      }
      if(s.isEmpty())
      return true;
      else return false;
  }
}