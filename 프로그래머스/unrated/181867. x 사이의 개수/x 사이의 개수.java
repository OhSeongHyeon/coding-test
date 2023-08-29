class Solution {
    public int[] solution(String myString) {
		String[] sa = myString.split("x");
		int sLen = sa.length;
		int aLen = myString.charAt(myString.length()-1) == 'x' ? sLen+1 : sLen;
		int[] ans = new int[aLen];
		
        for(int i=0; i<sLen; i++) ans[i] = sa[i].length();
        
        return ans;
    }
}