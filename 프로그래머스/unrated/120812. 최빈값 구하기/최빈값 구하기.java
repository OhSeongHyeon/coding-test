class Solution {
    public int solution(int[] array) {
        int[] cntArr = new int[1000];
        int mode = 0;
        int maxCnt = 0;
        
        for (int i = 0; i < array.length; i++) {
			cntArr[array[i]]++;
		}
        
        for (int i = 0; i < cntArr.length; i++) {
        	if(maxCnt < cntArr[i]) {
        		mode = i;
        		maxCnt = cntArr[i];
        	}
		}
        
        for (int i = 0; i < cntArr.length; i++) {
        	if(mode == i) continue;
        	if(maxCnt == cntArr[i]) return -1;
		}
        
        return mode;
    }
}