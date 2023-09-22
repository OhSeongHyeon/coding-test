class Solution {
    public String solution(String my_string) {
		char[] ca = my_string.toCharArray();
        
		for (int i = 0; i < ca.length; i++) {
			char c = ca[i];
			int convt = Math.abs('a'-'A');
			ca[i] = 'a' <= c && c <= 'z' ? (char) (c - convt) : (char) (c + convt);
		}
        
        return String.valueOf(ca);
    }
}