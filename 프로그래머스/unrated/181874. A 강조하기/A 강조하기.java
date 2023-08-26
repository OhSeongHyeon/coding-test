class Solution {
    public String solution(String myString) {
        char[] ca = myString.toCharArray();
        
        for (int i = 0; i < ca.length; i++) {
        	ca[i] = ca[i] == 'a' || ca[i] == 'A' ? 'A' : Character.toLowerCase(ca[i]);
		}
        
        return String.valueOf(ca);
    }
}