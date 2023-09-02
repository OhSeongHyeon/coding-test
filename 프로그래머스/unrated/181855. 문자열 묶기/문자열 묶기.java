class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int loop = 0;
        int[] cntArr = new int[100_001];
        
        for (int i = 0; i < strArr.length; i++) {
			int strLen = strArr[i].length();
			loop = Math.max(loop, strLen);
			cntArr[strLen]++;
		}
        
        for (int i = 1; i <= loop; i++) {
			answer = Math.max(answer, cntArr[i]);
		}
        
        return answer;
    }
}