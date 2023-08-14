class Solution {
    public int[] solution(int[] num_list, int n) {
		int len = num_list.length;
		int alen = len%n == 0 ? len/n : len/n + 1;
        int[] answer = new int[alen];
        int idx = 0;
        
        for (int i = 0; i < len; i+=n) {
			answer[idx++] = num_list[i];
		}
        
        return answer;
    }
}