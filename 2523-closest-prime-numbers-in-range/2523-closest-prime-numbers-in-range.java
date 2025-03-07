class Solution {
    public int[] closestPrimes(int left, int right) {
        int first=0;
        int second=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int ans[]=new int[]{-1,-1};
        for(int i=left;i<=right;i++)
        {
            if(isPrime(i))
            {
                if(first==0)
                first=i;
                else
                {
                    second=first;
                    first=i;
                    if(min>first-second)
                    {
                        min=first-second;
                        ans[0]=second;
                        ans[1]=first;
                    }

                }
            }
        }
        return ans;
    }
    private boolean isPrime(int n) {
        if(n<2) 
        return false;
        if(n==2 || n==3) 
        return true;
        if(n%2==0) 
        return false;
        for(int d=3;d*d<=n;d+=2) {
            if(n%d==0) 
            return false;
        }
        return true;
    }
}