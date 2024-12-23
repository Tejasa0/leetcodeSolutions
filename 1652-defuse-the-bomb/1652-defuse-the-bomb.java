class Solution {
    public int[] decrypt(int[] code, int k) {
        int len=code.length;
        int arr[]=new int[len];
        int sum=0;
        if(k>0)
        {
            for(int i=1;i<=k;i++)
            {
                sum+=code[i];
            }
            arr[0]=sum;
            int j=1;
            while(j<len)
            {
                sum-=code[j];
                sum+=code[(++k)%len];
                arr[j]=sum;
                j++;
            }
        }
        else if(k<0)
        {
            for(int i=(len+k);i<len;i++)
            {
                sum+=code[i];
            }
            arr[0]=sum;
            int j=1;
            while(j<len)
            {
                sum-=code[(len+(k++))%len];
                sum+=code[j-1];
                arr[j]=sum;
                j++;
            }
        }
        return arr;
    }
}