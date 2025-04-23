class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int curr=i;
            int sum=0;
            while(curr>0)
            {
                sum+=curr%10;
                curr/=10;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            max=Math.max(max,hm.get(sum));
        }
        int ans=0;
        for(int i:hm.values())
        {
            if(i==max)
            ans++;
        }
        return ans;
    }
}