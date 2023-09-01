import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
		int[] starr = Arrays.stream(arr).distinct().limit(k).toArray();
        int[] res = new int[k];
        Arrays.fill(res, -1);
        
        for (int i = 0; i < starr.length; i++) {
			res[i] = starr[i];
		}
        
        return res;
    }
}