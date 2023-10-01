class Solution {
    public int solution(int[] numbers) {
        int res = Integer.MIN_VALUE;
        int len = numbers.length;
        
        for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				int mul = numbers[i] * numbers[j];
				res = Math.max(res, mul);
			}
		}
        
        return res;
    }
}