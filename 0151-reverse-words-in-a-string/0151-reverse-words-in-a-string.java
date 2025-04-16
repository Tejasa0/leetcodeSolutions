class Solution {
    public String reverseWords(String m) {
        String s[]=m.split(" ");
        String str="";
        for(int k=s.length-1;k>=0;k--)
        {
            if(!s[k].trim().equals(""))
            str+=s[k]+" ";
        }
        return str.trim();
    }
}