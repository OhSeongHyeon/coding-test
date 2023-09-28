import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] res = new int[len];
        int[][] ref = new int[len][2];
        
        for (int i = 0; i < len; i++) {
			int nyamnyam = numlist[i] - n;
			ref[i][0] = Math.abs(nyamnyam);
			if(nyamnyam < 0) {
				ref[i][1] = -1;
			}
		}
        
        Arrays.sort(ref, (e1, e2) -> e1[0]==e2[0] ? e2[1]-e1[1] : e1[0]-e2[0]);
        
        for (int i = 0; i < len; i++) {
			res[i] = ref[i][1] == 0 ? n + ref[i][0] : n - ref[i][0];
		}
        
        return res;
    }
}