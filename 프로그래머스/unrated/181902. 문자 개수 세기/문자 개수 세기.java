class Solution {
    public int[] solution(String my_string) {
		int len = my_string.length();
        int[] answer = new int[52];
        
        for (int i = 0; i < len; i++) {
			char c = my_string.charAt(i);
			int idx = c >= 'A' && c <= 'Z' ? c-65 : c-71;
			answer[idx]++;
		}
        
        return answer;
    }
}