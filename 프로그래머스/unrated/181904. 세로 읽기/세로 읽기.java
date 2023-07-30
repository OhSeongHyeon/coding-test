class Solution {
    public String solution(String my_string, int m, int c) {
		int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len/m; i++) {
        	sb.append(my_string.charAt(i*m+c-1));
		}
        
        return sb.toString();
    }
}