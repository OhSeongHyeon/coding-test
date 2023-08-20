class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int k = 0; k < queries.length; k++) {
			int s = queries[k][0];
			int e = queries[k][1];
			
			for (int i = s; i <= e; i++) {
				arr[i] += 1;
			}
			
		}
        return arr;
    }
}