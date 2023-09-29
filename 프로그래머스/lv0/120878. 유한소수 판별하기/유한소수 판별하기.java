class Solution {
    public int solution(int a, int b) {
		int bdg = b / gcd(a, b);
        
        while(bdg != 1) {
            if(bdg % 2 == 0) {
            	bdg /= 2;
            }else if (bdg % 5 == 0) {
            	bdg /= 5;
            }else {
                return 2;
            }
        }
        
        return 1;
    }
	
	// 최대공약수
	private int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}