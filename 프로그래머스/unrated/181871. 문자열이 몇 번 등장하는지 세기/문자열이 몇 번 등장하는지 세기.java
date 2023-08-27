class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        int pLen = pat.length();
        
        for (int i = 0; i < len-pLen+1; i++) {
			String str = myString.substring(i, pLen+i);
			if(pat.equals(str)) {
				answer++;
			}
		}
        
        return answer;
    }
}