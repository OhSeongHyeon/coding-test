class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] row = {0, 1, 0, -1};
        int[] col = {1, 0, -1, 0};
        int rowIdx = 0;
        int colIdx = 0;
        int dir = 0;
        
        answer[rowIdx][colIdx] = 1;
        
        for (int i = 2; i <= n*n; i++) {
        	rowIdx += row[dir];
			colIdx += col[dir];
			
			if( !(0 <= rowIdx && rowIdx < n) || !(0 <= colIdx && colIdx < n) || answer[rowIdx][colIdx] != 0 ) {
				rowIdx -= row[dir];
				colIdx -= col[dir];
				dir = ++dir%4;
				rowIdx += row[dir];
				colIdx += col[dir];
				answer[rowIdx][colIdx] = i;
				continue;
			}
			
    		answer[rowIdx][colIdx] = i;
		}
        
        return answer;
    }
}