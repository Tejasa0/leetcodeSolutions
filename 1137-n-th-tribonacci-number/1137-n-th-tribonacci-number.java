class Solution {
    public int tribonacci(int n) {
        int arr[]=new int[38];
        arr[0]=0;
        arr[1]=arr[2]=1;
        for(int i=3;i<38;i++)
        {
            arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
        }
        //System.out.println(arr);
        return arr[n];
    }
}