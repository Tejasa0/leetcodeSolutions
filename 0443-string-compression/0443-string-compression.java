class Solution {
public static int compress(char[] chars) {
        int n=1;
        int total=0;
        int j=0;
        if(chars.length<=1)
        {
            return chars.length;
        }
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                n++;
            }
            else
            {
                chars[j++]=chars[i];
                if(n>1){
                String a=Integer.toString(n);
                
                for(int k=0;k<a.length();k++)
                {
                    chars[j++]=a.charAt(k);
                }
                n=1;
                total+=a.length();
                }
                total+=1;
                
                
            }
            
        }
        chars[j++]=chars[chars.length-1];
        if(n>1){
                String a=Integer.toString(n);
                
                for(int k=0;k<a.length();k++)
                {
                    chars[j++]=a.charAt(k);
                }
                n=1;
                total+=a.length();
                }

                total+=1;
        return total;
    }
}