class Solution {
  public List<String> generateParenthesis(int n) {
      ArrayList<String> list=new ArrayList<>();
      fun(list,n,0,0,"");
      return list;
  }
  
  public static void fun(List<String> list,int n , int open, int close , String ans){
      if(close==open && open==n)
      list.add(ans);
      
      if(open<n)
      fun(list,n,open+1,close,ans+"(");
      if(close<open)
      fun(list,n,open,close+1,ans+")");
     
  }
}