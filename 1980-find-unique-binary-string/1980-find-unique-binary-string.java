class Solution {
    Set<String>li=new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        for(String s:nums)
        li.add(s);
        int n=nums.length;
        return recursive("",n);

    }
    public String recursive(String s,int n)
    {
        if(s.length()==n)
        {
            if(!li.contains(s))
            return s;
            return "";
        }
        String zero=recursive(s+"0",n);
        if(zero.length()>0)
        return zero;
        return recursive(s+"1",n);
    }
}