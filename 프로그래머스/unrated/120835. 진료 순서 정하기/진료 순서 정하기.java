import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
		int len = emergency.length;
        int[][] sa = new int[len][2];
        int[] res = new int[len];
        
        for (int i = 0; i < len; i++) {
			sa[i][0] = i;
			sa[i][1] = emergency[i];
		}
        
        Arrays.sort(sa, (a, b) -> b[1] - a[1]);
        
        for (int i = 0; i < len; i++) {
			res[sa[i][0]] = i+1;
		}
        
        return res;
    }
}