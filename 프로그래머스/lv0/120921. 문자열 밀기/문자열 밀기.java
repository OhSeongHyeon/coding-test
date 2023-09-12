class Solution {
    public int solution(String a, String b) {
		if(a.equals(b)) {
			return 0;
		}
		
        int res = 0;
        int len = a.length();
        
        for (int i = 0; i < len; i++) {
			a = a.substring(len-1, len) + a.substring(0, len-1);
			res++;
			
			if(b.equals(a)) {
				return res;
			}
		}
        
        return -1;
    }
}