class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int len = matrix[0].length;
        int[][] new1 = new int[len][n];
        for(int i = 0; i<n;i++){
            for(int j =0 ; j < len; j++){
                new1[j][i] = matrix[i][j];
            }

        }
        return new1;
    }
}