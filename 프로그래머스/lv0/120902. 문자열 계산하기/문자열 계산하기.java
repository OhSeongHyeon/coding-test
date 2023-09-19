class Solution {
    public int solution(String my_string) {
        String[] sp = my_string.split("\\s");
        int res = Integer.parseInt(sp[0]);
        
        for (int i = 1; i < sp.length; i+=2) {
        	int n = Integer.parseInt(sp[i+1]);
			res += "+".equals(sp[i]) ? n : -n;
		}
        
        return res;
    }
}