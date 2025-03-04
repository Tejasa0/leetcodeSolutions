class Solution {
    public boolean checkPowersOfThree(int n) {
        int pow=0;
        while(n>Math.pow(3,pow))
        pow++;
        while(n>0)
        {
            if(n>=Math.pow(3,pow))
            n-=(int)Math.pow(3,pow);
            if(n>=Math.pow(3,pow))
            return false;
            pow--;
        }
        return true;
    }
}