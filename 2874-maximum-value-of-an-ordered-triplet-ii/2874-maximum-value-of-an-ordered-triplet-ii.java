class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int preMax[]=new int[n];
        int sufMax[]=new int[n];
        //int max=nums[0];
        preMax[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            preMax[i]=Math.max(preMax[i-1],nums[i]);
        }
       //System.out.println(preMax[n-1]);
        //max=nums[n-1];
        sufMax[n-1]=nums[n-1];
        for(int i=n-2;i>-1;i--)
        {
            sufMax[i]=Math.max(nums[i],sufMax[i+1]);
            System.out.print(sufMax[i]);
        }
        long ans=0;
        for(int j=1;j<n-1;j++)
        {
            ans=Math.max(ans,(long)((preMax[j-1]-nums[j])*(long)sufMax[j+1]));
        }
        return ans;
    }
}