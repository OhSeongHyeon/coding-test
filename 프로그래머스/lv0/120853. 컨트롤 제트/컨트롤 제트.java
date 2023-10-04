class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sp = s.split("\\s");
        for (int i = 0; i < sp.length; i++) {
			answer += sp[i].equals("Z") ? -Integer.parseInt(sp[i-1]) : Integer.parseInt(sp[i]);
		}
        return answer;
    }
}