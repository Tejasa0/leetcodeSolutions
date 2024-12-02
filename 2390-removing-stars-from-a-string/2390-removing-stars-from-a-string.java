class Solution {
    public String removeStars(String s) {
        String res="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            count--;
            else
            {
            res+=Character.toString(s.charAt(i));
            count++;
            }
            res=res.substring(0,count);
        }
        return res;
    }
}