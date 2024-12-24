class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int r=red;
        int b=blue;
        int i=1;
        while(true)
        {
            if(b-i<0)//8 5
            break;
            b-=i;
            i++;
            if(r-i<0)//2 
            break;
            r-=i;
            i++;
        }
        int j=1;
        while(true)
        {
            if(red-j<0)
            break;
            red-=j;
            j++;
            if(blue-j<0)
            break;
            blue-=j;
            j++;
        }
        return i>j?i-1:j-1;
    }
}
// r
// b b
// r r r
// b b b b