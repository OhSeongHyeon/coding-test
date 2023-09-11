class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int axis = total/num;
        int start = axis - (num/2);
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = total%num==0 ? start++ : ++start;
		}
        
        return answer;
    }
}