class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int ans=0;
        if(m>n)
        {
            if(!(n%2==0))
            {
            for(int i:nums1)
            {
                ans^=i;
            }
            }
            if(m%2==0)
            return ans;
            for(int i:nums2)
            {
                ans^=i;
            }
        }
        else
        {
            if(!(m%2==0)){
            for(int i:nums2)
            {
                ans^=i;
            }
            }
            if(n%2==0)
            return ans;
            for(int i:nums1)
            {
                ans^=i;
            }
        }
        return ans;
    }
}