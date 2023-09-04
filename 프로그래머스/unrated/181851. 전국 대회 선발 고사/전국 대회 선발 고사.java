import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int len = 0;
        
        for (boolean b : attendance) {
			if(b) len++;
		}
        
        int[][] stu = new int[len][2];
        int idx = 0;
        
        for (int i = 0; i < rank.length; i++) {
			if(attendance[i]) {
				stu[idx][0] = rank[i];
				stu[idx++][1] = i;
			}
		}
        
        Arrays.sort(stu, (a, b) -> a[0] - b[0]);
        
        return 10_000*stu[0][1] + 100*stu[1][1] + stu[2][1];
    }
}