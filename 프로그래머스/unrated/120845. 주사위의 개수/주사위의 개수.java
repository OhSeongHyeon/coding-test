class Solution {
    public int solution(int[] box, int n) {
		int res = 1;
        for (int b : box) {
        	int cnt = 0;
			while(b >= n) {
				b -= n;
				cnt++;
			}
			res *= cnt;
		}
        return res;
    }
}