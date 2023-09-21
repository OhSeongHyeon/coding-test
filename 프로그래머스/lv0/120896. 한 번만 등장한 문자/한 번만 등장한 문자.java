class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] alphaCnt = new int['z'-'a'+1];
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
			alphaCnt[s.charAt(i) - 'a']++;
		}
        
        for (int i = 0; i < alphaCnt.length; i++) {
			if(alphaCnt[i] == 1) {
				sb.append((char) (i+'a'));
			}
		}
        
        return sb.toString();
    }
}