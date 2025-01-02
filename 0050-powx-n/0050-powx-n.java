class Solution {
    public double myPow(double x, int n) {
        double res=x;
        double p=x;
        if(x==1)
        return 1;
        if(n>0)
        {
            while(n!=1)
            {
                res*=p;
                n--;
            }
        }
        else
        {
            while(n!=1)
            {
                res/=p;
                n++;
            }
        }
        return res;
    }
}