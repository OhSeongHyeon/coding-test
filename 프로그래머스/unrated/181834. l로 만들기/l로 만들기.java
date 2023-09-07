class Solution {
    public String solution(String myString) {
		char[] ca = myString.toCharArray();
		
		for (int i = 0; i < ca.length; i++) {
			if(ca[i] < 'l') ca[i] = 'l';
		}
        
        return String.valueOf(ca);
    }
}