class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(2*arr[i]) || (arr[i]%2==0 && hm.containsKey(arr[i]/2)))
            return true;
            hm.put(arr[i],i);
        }
        return false;
    }
}