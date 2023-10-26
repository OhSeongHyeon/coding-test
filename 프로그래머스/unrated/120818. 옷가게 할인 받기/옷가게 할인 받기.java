class Solution {
    public int solution(int price) {
        if(price < 100_000) {
        	return price;
        }else if(100_000 <= price && price < 300_000) {
        	return price*95/100;
        }else if(300_000 <= price && price < 500_000) {
        	return price*9/10;
        }
        return price*8/10;
    }
}