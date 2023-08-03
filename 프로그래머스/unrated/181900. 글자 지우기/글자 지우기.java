class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] ca = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
        	int t = indices[i];
        	ca[t] = 'A';
		}
        for (int i = 0; i < ca.length; i++) {
			if(ca[i] == 'A') {
				continue;
			}
			answer += ca[i];
		}
        return answer;
    }
}