class Solution {
    public int solution(String before, String after) {
        int len = before.length();
        int[] alpha = new int[26];
        
        for (int i = 0; i < len; i++) {
			alpha[before.charAt(i) - 'a']++;
			alpha[after.charAt(i) - 'a']++;
		}
        
        for (int i : alpha) {
			if(i%2 == 1) return 0;
		}
        
        return 1;
    }
}