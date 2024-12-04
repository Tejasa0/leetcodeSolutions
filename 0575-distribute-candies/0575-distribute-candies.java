class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>li=new HashSet<>();
        int len=candyType.length;
        if(len==0)
        {
            return 0;
        }
        li.add(candyType[0]);
        for(int i=1;i<len;i++)
        {
            li.add(candyType[i]);
        }
        if(li.size()>len/2)
        return (int)len/2;
    return li.size();
    }
}