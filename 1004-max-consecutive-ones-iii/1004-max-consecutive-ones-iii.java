class Solution {
        public int longestOnes(int[] A, int K) {
        int j = 0,i;
        for (i = 0; i < A.length; i++) {
            if (A[i] == 0) 
            K--;
            if (K < 0 && A[j++] == 0) 
            K++; 
        }
        return i-j;
    }
}