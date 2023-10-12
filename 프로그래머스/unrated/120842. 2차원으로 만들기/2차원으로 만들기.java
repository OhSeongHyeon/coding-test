import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
		int len = num_list.length;
        int[][] answer = new int[len/n][n];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = Arrays.copyOfRange(num_list, i*n, (i+1)*n);
		}
        
        return answer;
    }
}