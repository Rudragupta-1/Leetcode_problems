class Solution {
    public int countPrimes(int n) {
        if(n==0) return 0;
        if(n==1) return 0;
        if(n==2) return 0;
        int count=0;
        boolean prime[]=new boolean[n];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==false)
            {
                for(int j=2;i*j<prime.length;j++)
                {
                    prime[i*j]=true;
                }
            }
        }
        for(int i=2;i<prime.length;i++)
        {
            if(prime[i]==false)
            count++;
        }
        return count;
    }
}
