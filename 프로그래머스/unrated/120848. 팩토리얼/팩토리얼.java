class Solution {
    private static final int[] FAC_ARR = new int[11];
	
	static {
		int acc = 1;
		for (int i = 1; i <= 10; i++) {
			acc *= i;
			FAC_ARR[i] = acc;
		}
	}
	
	public int solution(int n) {
        for (int i = 10; i > 0; i--) {
			if(FAC_ARR[i] <= n) return i;
		}
        return 0;
    }
}