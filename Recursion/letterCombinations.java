class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ll=new ArrayList<>();
        if(digits.length()==0)
        return ll;
        combinations(digits,"",ll);
        
        return ll;
    }
    public static void combinations(String ques,String ans,List<String> ll){
        if(ques.length()==0){
        ll.add(ans);
        return;
        }
        char ch=ques.charAt(0);
        int num=ch-'0';
        String s=map[num];
        for(int i=0;i<s.length();i++)
        {
            combinations(ques.substring(1),ans+s.charAt(i),ll);
        }
    }

}
