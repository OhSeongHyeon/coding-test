class Solution {
    private static final char[] CA = new char[10];
	
	static {
		for (char i = 'a'; i < 'a'+10; i++) {
			CA[i-'a'] = i;
		}
	}

	public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
        	sb.append(CA[age%10]);
        	age /= 10;
        }
        
        return sb.reverse().toString();
    }
}