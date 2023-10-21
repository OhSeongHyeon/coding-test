import java.util.*;

class Solution {
    private static final String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	private static final Map<String, String> MH = new HashMap<>();
	
	static {
		char alpha = 'a';
		for (String m : MORSE) {
			MH.put(m, String.valueOf(alpha++));
		}
	}
	
	public String solution(String letter) {
		String[] sp = letter.split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for (String s : sp) {
			sb.append(MH.get(s));
		}
		
        return sb.toString();
    }
}