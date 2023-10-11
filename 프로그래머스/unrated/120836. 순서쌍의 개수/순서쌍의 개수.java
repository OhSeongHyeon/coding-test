class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
			if(n%i==0) answer++;
		}
        return (int) sqrt*(int) sqrt==n ? answer*2 - 1 : answer*2;
    }
}