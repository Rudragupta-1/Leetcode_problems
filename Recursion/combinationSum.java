class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> ll=new ArrayList<>();
    List<Integer> l=new ArrayList<>();
    func(candidates,target,ll,l,0);
    return ll;
    }
    public static void func(int[] candidates, int target,List<List<Integer>> ll,List<Integer> l,int idx){
        if(target==0)
        {
            ll.add(new ArrayList<>(l));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<candidates.length;i++)
        {   
            l.add(candidates[i]);
            func(candidates,target-candidates[i],ll,l,i);
            l.remove(l.size()-1);
        }
    }
}
