class Solution {
    public int[] solution(String[] strlist) {
		int len = strlist.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
			res[i] = strlist[i].length();
		}
        return res;
    }
}