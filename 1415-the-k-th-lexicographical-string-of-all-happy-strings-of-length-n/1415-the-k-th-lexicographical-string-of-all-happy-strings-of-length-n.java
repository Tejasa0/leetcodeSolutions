class Solution {
    public void recursive(String curr,int n) {
        if (curr.length()==n) {
            li.add(curr);
            return;
        }
        for(char ch='a';ch<'d';ch++) {
            if (curr.length()>0 && curr.charAt(curr.length()-1)==ch)
                continue;
            recursive(curr+ch,n);
        }
    }
    
    List<String>li=new ArrayList<>();
    public String getHappyString(int n, int k) {
        String curr="";
        recursive(curr,n);

        if (li.size()<k) 
            return "";
        Collections.sort(li);
        return li.get(k - 1);
    }

    
}