class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts)
        {
            q.offer(i);
        }
        while(k>0)
        {
            int ele=q.poll();
            int a=(int)Math.sqrt(ele);
            q.offer(a);
            k--;
        }
        int sum=0;
        while(!q.isEmpty())
        {
            sum+=q.poll();
        }
        return sum;
    }
}