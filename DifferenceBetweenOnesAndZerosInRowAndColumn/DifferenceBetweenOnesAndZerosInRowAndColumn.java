class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int rowSize = grid.length;
        int colSize = grid[0].length;
        
        int[] rows = new int[rowSize];
        int[] cols = new int[colSize];
        
        int[][] diff = new int[grid.length][grid[0].length];
        
        //to iterate through the given matrix
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                // rows[i] += (grid[i][j] == 1?1:0);
                if(grid[i][j] == 1){
                    rows[i] += 1;
                }else{
                    rows[i] += 0;   
                }
                // cols[j] += (grid[i][j] == 1?1:0);
                if(grid[i][j] == 1){
                    cols[j] += 1;
                }else{
                    cols[j] += 0;
                }
            }
        }
        
        //to populate diff matrix
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                diff[i][j] = rows[i] + cols[j] - (rowSize-rows[i]) - (colSize-cols[j]); 
            }
        }

        return diff;
    }
}
