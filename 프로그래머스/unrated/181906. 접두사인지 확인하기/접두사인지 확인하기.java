class Solution {
    public int solution(String my_string, String is_prefix) {
        int len = my_string.length();
        String[] pa = new String[len];
        
        for (int i = 0; i < len; i++) {
			pa[i] = my_string.substring(0, i);
		}
        
        for (int i = 0; i < pa.length; i++) {
			if(pa[i].equals(is_prefix)) {
				return 1;
			}
		}
        
        return 0;
    }
}