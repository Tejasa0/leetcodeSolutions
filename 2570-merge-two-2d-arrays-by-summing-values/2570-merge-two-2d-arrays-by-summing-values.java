class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                hm.put(nums1[i][0],nums1[i][1]+nums2[j][1]);
                j++;
                i++;
            }
            else if(nums1[i][0]<nums2[j][0])
            {
                hm.put(nums1[i][0],nums1[i][1]);
                i++;
            }
            else
            {
                hm.put(nums2[j][0],nums2[j][1]);
                j++;
            }
        }
        while(i<nums1.length)
        {
            hm.put(nums1[i][0],nums1[i][1]);
            i++;
        }
        while(j<nums2.length)
        {
            hm.put(nums2[j][0],nums2[j][1]);
            j++;
        }
        int ans[][]=new int[hm.size()][2];
        int m=0;
        for(int k:hm.keySet())
        {
            ans[m][0]=k;
            ans[m++][1]=hm.get(k);
        }
        return ans;
    }
}