class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    boolean ans=func(board,i,j,word,0);
                    if(ans==true)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean func(char[][] board, int cc,int cr,String words,int idx){
        if(idx==words.length())
        {
            return true;
        }
            if(cc<0 || cr<0 ||cc>=board.length || cr>=board[0].length || words.charAt(idx)!=board[cc][cr])
            return false;
            board[cc][cr]='*';
            int r[]={-1,0,1,0};
            int c[]={0,-1,0,1};
            for(int k=0;k<c.length;k++){
                
                    boolean ans=func(board,cc+r[k],cr+c[k],words,idx+1);
                    if(ans==true)
                    return true;
                
            }
            board[cc][cr]=words.charAt(idx);
            return false;
    }
}
