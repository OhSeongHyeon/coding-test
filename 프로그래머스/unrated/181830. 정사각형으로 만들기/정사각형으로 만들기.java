class Solution {
    public int[][] solution(int[][] arr) {
		int rowLen = arr.length;
		int colLen = arr[0].length;
		
		if(rowLen > colLen) {
			int[][] res = new int[rowLen][rowLen];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					res[i][j] = arr[i][j];
				}
			}
			return res;
		}else if(rowLen < colLen) {
			int[][] res = new int[colLen][colLen];
			for (int i = 0; i < arr.length; i++) {
				res[i] = arr[i];
			}
			return res;
		}
        
        
        return arr;
    }
}