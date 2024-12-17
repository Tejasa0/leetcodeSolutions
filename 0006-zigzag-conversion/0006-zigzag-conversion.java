class Solution {
    public String convert(String s, int numRows) {
        String result="";
        if(numRows==1)
			return s;
        int step1,step2;
        int size=s.length();
        for(int i=0;i<numRows;i++){
            step1=(numRows-i-1)*2;
            step2=(i)*2;
            int curr=i;
            if(curr<size)
                result+=s.charAt(curr);
            while(true){
                curr+=step1;
                if(curr>=size)
                    break;
				if(step1>0)
					result+=s.charAt(curr);
                curr+=step2;
                if(curr>=size)
                    break;
				if(step2>0)
					result+=s.charAt(curr);
            }
        }
        return result;
    }
}