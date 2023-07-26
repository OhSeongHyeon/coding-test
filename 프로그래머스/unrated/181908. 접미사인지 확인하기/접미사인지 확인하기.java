class Solution {
    public int solution(String my_string, String is_suffix) {
		int len = my_string.length();
		String[] suffixs = new String[len];
		
		for (int i = 0; i < len; i++) {
			suffixs[i] = my_string.substring(i, len);
		}
		
		for (String s : suffixs) {
			if(s.equals(is_suffix)) {
				return 1;
			}
		}
		
        return 0;
    }
}