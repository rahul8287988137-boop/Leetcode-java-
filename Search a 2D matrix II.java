class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length;
        int m = matrix[0].length;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = 0;
        int col = m - 1;
        while(row<l && col>=0){
            if(matrix[row][col] == target){

                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
       
    }
}