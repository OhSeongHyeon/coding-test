class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int l = i; l <= j; l++) {
			sb.append(l);
		}
        
        return sb.toString().replaceAll("[^"+k+"]", "").length();
    }
}