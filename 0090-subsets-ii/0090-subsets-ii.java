class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer>li=new ArrayList<>();
        bct(nums, 0,li,ans);
        return ans;
    }
    public void bct(int[] nums,int i,List<Integer> li,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        bct(nums,i+1,li,ans);
        li.remove(Integer.valueOf(nums[i]));
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1])
        {
            idx++;
        }
        bct(nums,idx,li,ans);
    }
}