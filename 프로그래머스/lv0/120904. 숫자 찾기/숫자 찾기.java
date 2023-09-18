class Solution {
    public int solution(int num, int k) {
		String strNum = String.valueOf(num);
		String kn = String.valueOf(k);
		int idx = strNum.indexOf(kn);
        return idx == -1 ? -1 : ++idx;
    }
}