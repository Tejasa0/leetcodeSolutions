class Solution {
    public long countBadPairs(int[] nums) {
        long count=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if((j-i)!=(nums[j]-nums[i]))
        //         count++;
        //     }
        // }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=i-nums[i];
            int notBad=hm.getOrDefault(diff,0);
            count+=i-notBad;
            hm.put(diff,notBad+1);

        }
        return count;
    }
}