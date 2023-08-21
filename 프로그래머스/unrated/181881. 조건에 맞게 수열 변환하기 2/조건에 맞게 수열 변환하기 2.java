class Solution {
    public int solution(int[] arr) {
		int len = arr.length;
		int unchangedCnt = 0;
		int loopCnt = 0;
		
		while(true) {
			loopCnt++;
            unchangedCnt = 0;
			
			for (int i = 0; i < len; i++) {
				int n = arr[i];
				
				if(n >= 50 && n%2 == 0) {
					arr[i] = n/2;
				}else if(n < 50 && n%2 != 0) {
					arr[i] = n*2 + 1;
				}else {
					unchangedCnt++;
				}
			}
			
			if(len == unchangedCnt) {
				break;
			}
		}
        
        return loopCnt-1;
    }
}