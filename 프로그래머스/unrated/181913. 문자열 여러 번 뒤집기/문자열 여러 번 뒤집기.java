class Solution {
    public String solution(String str, int[][] qs) {
        char[] ca = str.toCharArray();
        for (int i = 0; i < qs.length; i++) {
        	int s = qs[i][0];
        	int e = qs[i][1];
			while(true) {
				if(s >= e) {
					break;
				}
				char tmp = ca[s];
				ca[s] = ca[e];
				ca[e] = tmp;
				s++;
				e--;
			}
		}
        return String.valueOf(ca);
    }
}