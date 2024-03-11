class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll=new ArrayList<>();
        List<String> l=new ArrayList<>();
        func(s,l,ll);
        return ll;
    }
    public static void func(String s,List<String> l ,List<List<String>>ll){
        if(s.length()==0){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String check=s.substring(0,i);
            if(isPalindrome(check)){
                l.add(check);
            func(s.substring(i),l,ll);
            l.remove(l.size()-1);}
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}
