class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        
        if(len >= 11) {
        	for(int n : num_list)
        		answer += n;
        }else if(len <= 10) {
            answer = 1;
        	for(int n : num_list)
        		answer *= n;
        }
        
        return answer;
    }
}