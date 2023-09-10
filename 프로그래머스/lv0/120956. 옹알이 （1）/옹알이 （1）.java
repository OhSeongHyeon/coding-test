class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String pron = "aya|ye|woo|ma";
        
        for (String s : babbling) {
			if(s.replaceAll(pron, "").isEmpty()) answer++;
		}
        
        return answer;
    }
}