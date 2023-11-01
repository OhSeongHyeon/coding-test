import java.math.*;

class Solution {
    public long solution(int balls, int share) {
        return fac(balls).divide(fac(balls-share).multiply(fac(share))).longValue();
    }
	
	private BigInteger fac(int n) {
		if(n <= 1) return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(fac(n-1));
	}
}