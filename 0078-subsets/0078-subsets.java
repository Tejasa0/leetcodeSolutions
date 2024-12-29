class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
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
        bct(nums,i+1,li,ans);
    }
}