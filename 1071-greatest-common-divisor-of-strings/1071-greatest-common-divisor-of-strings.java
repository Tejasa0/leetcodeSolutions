class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1))
        {
            return str1.substring(0,gcd(str1.length(), str2.length()));

        }
        return "";
    }
    private int gcd(int a, int b) {
        int i=a>b?b:a;
        while(i>0)
        {
            if(a%i==0 && b%i==0)
            return i;
            i--;
        }
        return 1;
    }
}