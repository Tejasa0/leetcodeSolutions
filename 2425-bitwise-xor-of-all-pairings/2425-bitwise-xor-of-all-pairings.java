class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i:nums1)
        {
            if(hm.containsKey(i))
            hm.put(i,hm.get(i)+n);
            else
            hm.put(i,n);
        }
        for(int i:nums2)
        {
            if(hm.containsKey(i))
            hm.put(i,hm.get(i)+m);
            else
            hm.put(i,m);
        }
        int ans=0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)%2==1)
            ans^=i;
        }
        return ans;
    }
}