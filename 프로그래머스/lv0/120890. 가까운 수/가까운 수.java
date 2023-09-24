class Solution {
    public int solution(int[] array, int n) {
        int left = 101;
        int right = 101;
        
        for (int i = 0; i < array.length; i++) {
        	if(n-array[i] == 0) {
        		return n;
        	}
        	if(n-array[i] > 0) {
        		left = Math.min(left, n-array[i]);
        	}else {
        		right = Math.min(right, array[i]-n);
        	}
		}
        
        return left > right ? n+right : n-left;
    }
}