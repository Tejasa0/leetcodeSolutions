class Solution {
    public int rob(int[] nums) {
        int arr[]=new int[nums.length];
        if(nums.length==1)
        return nums[0];
        arr[0]=nums[0];
        arr[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++){
            arr[i]=Math.max(nums[i]+arr[i-2],arr[i-1]);
        }
        return arr[nums.length-1];
    }
}