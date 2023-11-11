class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        boolean[][] isBombArr = new boolean[len][len];
        
        for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(board[i][j] != 1) {
					continue;
				}
				for (int k = i-1; k <= i+1; k++) {
					for (int l = j-1; l <= j+1; l++) {
						if(0 <= k && k < len && 0 <= l && l < len) {
							isBombArr[k][l] = true;
						}
					}
				}
			}
		}
        
        for(boolean[] ba : isBombArr) {
        	for(boolean ib : ba) {
        		if(!ib) answer++;
        	}
        }
        
        return answer;
    }
}