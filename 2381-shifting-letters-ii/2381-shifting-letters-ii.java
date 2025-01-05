class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] arr= s.toCharArray();
        for(int i=0;i<shifts.length;i++)
        {
            if(shifts[i][2]==1)
            {
                for(int j=shifts[i][0];j<=shifts[i][1];j++)
                {
                    arr[j]=(char)((arr[j]-'a'+1)%26+'a');
                }
            }
            else
            {
                for(int j=shifts[i][0];j<=shifts[i][1];j++)
                {
                    arr[j]=(char)((arr[j]-'a'-1+26)%26+'a');
                }
            }
        }
        return new String(arr);
    }
}