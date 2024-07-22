class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while(sr <= er && sc <= ec) {
            //top boundry 
            for(int j = sc; j <= ec; j++){
                ans.add(matrix[sr][j]);
            }
            //Right boundry
            for(int i = sr+1; i<= er; i++) {
                ans.add(matrix[i][ec]);
            }
            //bottom 
            for(int j = ec - 1; j >= sc; j--) {
                if(sr == er ) break;
                ans.add(matrix[er][j]);
            }
            //left boundry
            for(int i = er -1; i >= sr + 1; i--) {
                if(sc == ec) break;
                ans.add(matrix[i][sc]);
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        return ans;
    }
}