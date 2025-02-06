class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int prod=nums[i]*nums[j];
                if(hm.containsKey(prod))
                {
                    hm.put(prod,hm.get(prod)+1);
                }
                else
                hm.put(prod,1);
            }
        }
        int ans=0;
        for(Integer key : hm.keySet())
        {
            int val=hm.get(key);
            int pairsCount=((val-1)*val)/2;
            //if(val>1)
            ans+=8*pairsCount;
        }
        return ans;
    }
}
// 6 8 12 16 24 
//12 18 24 36
// 24 32 48
//48 72
//96
// 2 3
