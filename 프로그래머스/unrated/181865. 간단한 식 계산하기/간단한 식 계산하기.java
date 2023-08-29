class Solution {
    public int solution(String binomial) {
        String[] split = binomial.split("\\s");
        int answer = 0;
        int f = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        
        switch (split[1]) {
		case "+": return answer = f + b;
		case "-": return answer = f - b;
		case "*": return answer = f * b;
		}
        
        return answer;
    }
}