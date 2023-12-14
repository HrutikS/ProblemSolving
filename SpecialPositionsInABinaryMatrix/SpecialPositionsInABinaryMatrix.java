class Solution {
    public int numSpecial(int[][] mat) {
        int counter = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    if(verifyZeros(mat, i, j)){
                        counter++;
                    }
                }
                
            }
        }
        return counter;
    }

    public boolean verifyZeros(int[][] mat, int x, int y){
        for(int i=0; i<mat.length; i++){
            if(i != x){
                if(mat[i][y] == 1){
                    return false;
                }
            }
        }
        for(int i=0; i<mat[0].length; i++){
            if(i != y){
                if(mat[x][i] == 1){
                    return false;
                }
            }
        }
        return true;
    }
}
