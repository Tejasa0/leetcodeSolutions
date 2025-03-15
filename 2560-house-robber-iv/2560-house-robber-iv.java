class Solution {
    public int minCapability(int[] nums, int k) {
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int num:nums){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0,i=0;
            while(i<nums.length){
                if(nums[i]<=mid){
                    count++;
                    i+=2;
                }else{
                    i++;
                }
            }
            if(count>=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}