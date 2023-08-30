class Solution {
    public int solution(String myString, String pat) {
        char[] ca = myString.toCharArray();

        for (int i = 0; i < ca.length; i++) {
			ca[i] = ca[i] == 'A' ? 'B' : 'A';
		}
        
        return String.valueOf(ca).contains(pat) ? 1 : 0;
    }
}