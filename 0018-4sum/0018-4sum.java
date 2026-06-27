class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>li= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            while(i>0 && i<nums.length && nums[i]==nums[i-1])
            i++;
            for(int j=i+1;j<nums.length;j++)
            {
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum<target)
                    {
                        k++;
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    else if(sum==target)
                    {
                        li.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<nums.length && nums[k]==nums[k-1]){
                        k++;}
                        while(l>0 && nums[l]==nums[l+1]){
                        l--;}
                    }
                    
                } 
                while(j+1<nums.length && nums[j]==nums[j+1])
                    j++;
            }
        }
        return li;
    }
}