class Solution {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        Map<Integer, Pair<Integer, Integer>> pos = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = mat[i][j];
                pos.put(value, new Pair(i, j));
            }
        }

        for (int k = 0; k < arr.length; k++) {
            int num = arr[k];
            Pair<Integer, Integer> pos1 = pos.get(num);
            int i = pos1.getKey();
            int j = pos1.getValue();
            mat[i][j] = -mat[i][j];
            
            if (checkRow(i, mat) || checkColumn(j, mat)) {
                return k;
            }
        }

        return -1;
    }

    private boolean checkRow(int row, int[][] mat) {
        for (int col = 0; col < mat[0].length; col++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }
}