class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        perBct(nums,ans,nums.length,0);
        return ans;
    }
    public void perBct(int[] nums,List<List<Integer>>ans,int n,int idx)
    {
        if(idx==n)
        {
            List<Integer> currentPer= new ArrayList<>();
            for (int num : nums) {
                currentPer.add(num);
            }
            ans.add(currentPer);
            return;
        }
        for(int i=idx;i<n;i++)
        {
            int s=nums[idx];
            nums[idx]=nums[i];
            nums[i]=s;

            perBct(nums,ans,n,idx+1);
            s=nums[idx];
            nums[idx]=nums[i];
            nums[i]=s;
        }
    }
}