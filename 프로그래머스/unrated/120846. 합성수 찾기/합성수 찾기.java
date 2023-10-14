class Solution {
    public int solution(int n) {
		int res = 0;
        for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j*j <= i; j++) {
				if(j*j == i) cnt++;
				else if(i%j == 0) cnt += 2;
			}
			if(cnt > 2) res++;
		}
        return res;
    }
}