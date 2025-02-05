class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(!(isEven(nums[i]) ^ isEven(nums[i+1])))
            return false;
        }
        return true;
    }
    public static boolean isEven(int n)
    {
        if(n%2==0)
        return true;
        return false;
    }
}