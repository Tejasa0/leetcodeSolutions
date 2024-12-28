class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int en=nums.length;
        while(st<en)
        {
            int mid=(st+en)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            en=mid;
            else
            st=mid+1;
        }
        return -1;
    
    }
}