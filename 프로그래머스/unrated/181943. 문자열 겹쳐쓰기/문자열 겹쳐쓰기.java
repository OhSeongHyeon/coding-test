class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] mca = my_string.toCharArray();
        int len = overwrite_string.length();
        for (int i = 0; i < len; i++) {
			mca[s++] = overwrite_string.charAt(i);
		}
        return String.valueOf(mca);
    }
}