class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int n1=nums1.length;
      int n2=nums2.length;
          Stack<Integer> s=new Stack<>();
          int nxtGr[]=new int[n2];
          for(int i=n2-1;i>=0;i--)
          {
              while(!s.isEmpty() && nums2[s.peek()]<=nums2[i]){
                  s.pop();
              }
              if(s.isEmpty())
              nxtGr[i]=-1;
              else nxtGr[i]=nums2[s.peek()];
              s.push(i);
          }
          int res[]=new int[n1];
          for(int i=0;i<n1;i++)
          {
              for(int j=0;j<n2;j++)
              {
                  if(nums1[i]==nums2[j]){
                  res[i]=nxtGr[j];
                  break;}
              }
          }
          return res;
  }
}