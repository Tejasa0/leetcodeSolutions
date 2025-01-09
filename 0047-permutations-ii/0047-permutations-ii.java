class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        perBct(nums,ans,nums.length,0);
        Set<List<Integer>> set = new HashSet<>(ans);
        List<List<Integer>> arrayList = new ArrayList<>(set);
        return arrayList;
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
            while(i+1<n && nums[i]==nums[i+1])
            {
                i++;
            }
            s=nums[idx];
            nums[idx]=nums[i];
            nums[i]=s;
        }
    }
}