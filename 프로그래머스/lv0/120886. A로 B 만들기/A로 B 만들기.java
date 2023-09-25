class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int len = before.length();
        
        for (int i = 0; i < len; i++) {
			answer += (before.charAt(i) - after.charAt(i));
		}
        
        return answer==0 ? 1 : 0;
    }
}