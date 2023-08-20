class Solution {
    public int[] solution(int[] arr) {
		int len = arr.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
        	int n = arr[i];
			if(n >= 50 && n%2 == 0) {
				answer[i] = n/2;
			}else if(n < 50 && n%2 != 0) {
				answer[i] = n*2;
			}else {
				answer[i] = n;
			}
		}
        
        return answer;
    }
}