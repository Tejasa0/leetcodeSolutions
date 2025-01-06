class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=nums[i];
            if(hm.containsKey(curr))
            {
                int x=hm.get(curr);
                while(j<=x)
                {
                    int left=nums[j];
                    hm.remove(left);
                    count-=left;
                    j++;
                }
            }
            hm.put(curr,i);
            count+=curr;
            sum=Math.max(count,sum);
        }
        return sum;
    }
}