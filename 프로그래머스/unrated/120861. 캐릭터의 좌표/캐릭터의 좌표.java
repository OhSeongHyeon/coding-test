class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int h = (board[0]-1)/2;
        int v = (board[1]-1)/2;
        
        for (String k : keyinput) {
			switch (k) {
				case "up": answer[1] = answer[1]+1 <= v ? answer[1]+1 : answer[1];
					break;
				case "down": answer[1] = Math.abs(answer[1]-1) <= v ? answer[1]-1 : answer[1];
					break;
				case "left": answer[0] = Math.abs(answer[0]-1) <= h ? answer[0]-1 : answer[0];
					break;
				case "right": answer[0] = answer[0]+1 <= h ? answer[0]+1 : answer[0];
					break;
			}
		}
        
        return answer;
    }
}