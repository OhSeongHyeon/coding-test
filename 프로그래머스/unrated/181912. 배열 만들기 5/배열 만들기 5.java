import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new LinkedList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
			String str = intStrs[i];
			int n = Integer.parseInt(str.substring(s, s+l));
			if(n > k) {
				answer.add(n);
			}
		}
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}