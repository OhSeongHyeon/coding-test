class Solution {
    public String[] solution(String[] names) {
		int len = names.length;
		int alen = len%5 == 0 ? len/5 : len/5 + 1;
        String[] answer = new String[alen];
        int idx = 0;
        
        for (int i = 0; i < len; i+=5) {
			answer[idx++] = names[i];
		}
        
        return answer;
    }
}