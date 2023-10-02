import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        Set<Integer> ts = new TreeSet<Integer>();
        
        for (int i = 2; i <= n; i++) {
			while(n%i == 0) {
				ts.add(i);
				n /= i;
			}
		}
        
        return ts.toArray(Integer[]::new);
    }
}