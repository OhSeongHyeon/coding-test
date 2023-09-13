class Solution {
    public String[] solution(String str, int n) {
        int len = str.length();
        int loop = len%n==0 ? len/n : len/n+1;
        String[] res = new String[loop];
        
        for (int i = 0; i < loop; i++) {
			res[i] = str.substring(i*n, (i+1)*n>=len ? len : (i+1)*n);
		}
        
        return res;
    }
}