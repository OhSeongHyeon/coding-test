class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
			if(answer[0] < arr[i]) {
				answer[0] = arr[i];
				answer[1] = i;
			}
		}
        
        return answer;
    }
}