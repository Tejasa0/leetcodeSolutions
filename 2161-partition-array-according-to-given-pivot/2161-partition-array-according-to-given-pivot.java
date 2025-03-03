class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>lessList=new ArrayList<>();
        List<Integer>greaterList=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            lessList.add(nums[i]);
            else if(nums[i]>pivot)
            greaterList.add(nums[i]);
        }
        int size1=lessList.size();
        int size2=greaterList.size();
        int j=0;
        for(int i=0;i<size1;i++)
        {
            nums[j++]=lessList.get(i);
        }
        for(int i=size1;i<nums.length-size2;i++)
        {
            nums[j++]=pivot;
        }
        for(int i=0;i<size2;i++)
        {
            nums[j++]=greaterList.get(i);
        }
        return nums;
    }
}