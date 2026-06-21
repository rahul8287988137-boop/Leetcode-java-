class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int lb = 0;
        int ub = (row * col) - 1;
        while(lb <= ub){
            int mid = lb +(ub - lb)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            int element = matrix[midRow][midCol];
            if(element == target){
                return true;
            }
            else if(element < target){
                lb = mid+1;
            }
            else{
                ub = mid - 1;
            }
        }
        return false;
    }
}