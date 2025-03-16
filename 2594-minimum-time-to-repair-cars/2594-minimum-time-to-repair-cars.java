class Solution {
    public long repairCars(int[] ranks, int cars) {
        int low=ranks[0];
        int high=ranks[0];
        for(int rank:ranks)
        {
            low=Math.min(rank,low);
            high=Math.max(rank,high);
        }
        int arr[]=new int[high+1];
        for(int rank:ranks)
        {
            arr[rank]++;
        }
        long low1=1;
        long high1=1L*low*cars*cars;
        while(low1<high1)
        {
            long mid=(low1+high1)/2;
            long carCount=0;
        for(int rank=1;rank<=high;rank++)
        {
            carCount+=arr[rank]*(long)Math.sqrt(mid/(long)rank);
        }
        if(carCount>=cars)
        {
            high1=mid;
        }
        else
        {
            low1=mid+1;
        }
        }
        return low1;
    }
}