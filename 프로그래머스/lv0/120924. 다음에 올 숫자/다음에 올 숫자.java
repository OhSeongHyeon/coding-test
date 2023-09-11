class Solution {
    public int solution(int[] cm) {
        int answer = 0;
        int len = cm.length;
        int a = cm[0], b = cm[1], c = cm[2];
        int arith = b - a;
        int geo = a==0 ? 0 : b / a;
        
        if(a+arith == b && b+arith == c) {
        	answer = cm[len-1] + arith;
        }else {
        	answer = cm[len-1] * geo;
        }
        
        return answer;
    }
}