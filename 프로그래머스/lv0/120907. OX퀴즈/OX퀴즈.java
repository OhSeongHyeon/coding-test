class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++) {
			String[] sp = quiz[i].split("\\s");
			int ln1 = Integer.parseInt(sp[0]);
			int ln2 = Integer.parseInt(sp[2]);
			int rn = Integer.parseInt(sp[4]);
			int res = sp[1].equals("+") ? ln1+ln2 : ln1-ln2;
			answer[i] = rn==res ? "O" : "X";
		}
        
        return answer;
    }
}