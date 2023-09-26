import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
		int len = score.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
			score[i][0] = score[i][0]+score[i][1];
			score[i][1] = i;
		}
        
        Arrays.sort(score, (s1, s2) -> s1[0]==s2[0] ? s1[1]-s2[1] : s2[0]-s1[0]);
        
        int preScore = Integer.MAX_VALUE;
        int rank = 1;
        
        for (int i = 0; i < len; i++) {
        	int avg = score[i][0];
        	int idx = score[i][1];
        	
        	if(avg==preScore) {
        		answer[idx] = rank;
        	}else {
        		answer[idx] = i+1;
        		rank = i+1;
        	}
        	
        	preScore = Math.min(preScore, avg);
		}
        
        return answer;
    }
}