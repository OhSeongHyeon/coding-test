import java.math.BigInteger;

class Solution {
    
    private static BigInteger NINE = new BigInteger("9");
    
	public int solution(String sn) {
        return new BigInteger(sn).remainder(NINE).intValue();
    }
}